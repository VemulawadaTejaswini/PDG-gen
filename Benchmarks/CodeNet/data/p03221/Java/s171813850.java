
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	private static int M;

	public static void main(String[] args) throws Exception {

//		System.setIn(new FileInputStream("D:\\Workspace\\SW\\src\\b\\tt2"));
//		long start = System.currentTimeMillis();

		// strat
		// B - ID
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		int[] P = new int[N + 1];
		int[][] arr = new int[M + 1][4];// 0 保存原值P，1保存原值Y， 2排序， 3州内顺序

		for (int i = 1; i <= M; i++) {
			st = new StringTokenizer(br.readLine());
			int p = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());

			arr[i][0] = p;
			arr[i][1] = y;
			arr[i][2] = i;
		}

//		 第一次排序
//		qSort(arr, 1, M, 1);
		mergeSort(arr, M+1, 1);

		for (int i = 1; i <= M; i++) {
			arr[i][3] = ++P[arr[i][0]];
		}
		// 第二次排序
//		qSort(arr, 1, M, 2);
		mergeSort(arr, M+1, 2);

		for (int i = 1; i <= M; i++) {
			System.out.format("%06d%06d\n", arr[i][0], arr[i][3]);
		}

		// end
//		long end = System.currentTimeMillis();
//		System.out.format("%.3f (s)", (end - start) / 1000.0);
	}

	// 归并排序
	public static void mergeSort(int[][] array, int len, int index) {
		int eachGroupNumbers = 1;
		int[][] temp = new int[len][];
		int high = -1;
		int low;
		while (eachGroupNumbers <= len) {
			low = 1;
			high = low + 2 * eachGroupNumbers - 1;
			// 两两合并数组的两个有序序列
			// 假设每个part1都有对应的part2

			// 以high作为边界检测条件,如果part2的右边界high小于整个待排序序列的右边界，则两个有序序列进行合并。
			for (; high < len; high = low + 2 * eachGroupNumbers - 1) {// 以high作为边界检测条件
				mergeArray(array, low, low + eachGroupNumbers - 1, high, temp, index);
				low = high + 1;
			}
			/*
			 * 跳出循环，说明part2的右边界已经超出了整个待排序序列的右边界。 如果part2的左边界mid还在整个序列的右边界内，将两序列进行合并，
			 */
			if (low + eachGroupNumbers - 1 < len) {// 以mid作为边界检测条件
				mergeArray(array, low, low + eachGroupNumbers - 1, len - 1, temp, index);
			}
			/*
			 * 如果part2的左边界也不在整个序列的右边界范围内，说明这个part1并没有对应的part2，不做任何处理。
			 */
			// 本轮合并完成,继续划分数组
			eachGroupNumbers = eachGroupNumbers << 1;
			// System.out.println("本轮的结果:"+Arrays.toString(array));
		}

	}

	public static void mergeArray(int[][] arr, int low, int mid, int high, int tmp[][], int index) {
		int i = low;
		int j = mid + 1;
		int k = low;
		// 将合并后的元素存到临时数组中
		while (i <= mid && j <= high) {
			if (arr[i][index] < arr[j][index]) {
				tmp[k++] = arr[i++];
			} else {
				tmp[k++] = arr[j++];
			}
		}
		while (i <= mid) {
			tmp[k++] = arr[i++];
		}
		while (j <= high) {
			tmp[k++] = arr[j++];
		}
		// 将临时数组中内容赋值给原数组
		for (int l = low; l <= high; l++) {
			arr[l] = tmp[l];
		}
	}

	// 冒泡 不行
	static void maopao(int[][] array, int idx) {
		for (int i = 1; i <= M; ++i) {
			boolean noswap = true; // 循环次数为待排序数第一位数冒泡至最高位的比较次数
			for (int j = 1; j <= M - i - 1; ++j) {
				if (array[j][idx] > array[j + 1][idx]) {
					swap(array, j, j + 1);
					noswap = false;
				}
			}
			if (noswap)
				break;
		}
	}

	// 非递归 快速排序
	public static void qSort(int[][] a, int low, int high, int idx) {
		int pivot;
		if (low >= high)
			return;
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(low);
		stack.push(high);
		while (!stack.empty()) {
			// 先弹出high,再弹出low
			high = stack.pop();
			low = stack.pop();
			pivot = partition(a, low, high, idx);
			// 先压low,再压high
			if (low < pivot - 1) {
				stack.push(low);
				stack.push(pivot - 1);
			}
			if (pivot + 1 < high) {
				stack.push(pivot + 1);
				stack.push(high);
			}
		}
	}

	public static int partition(int[][] a, int low, int high, int index) {

		// 三数取中,将中间元素放在第一个位置
		if (a[low][index] > a[high][index])
			swap(a, low, high);
		if (a[(low + high) / 2][index] > a[high][index])
			swap(a, (low + high) / 2, high);
		if (a[low][index] < a[(low + high) / 2][index])
			swap(a, (low + high) / 2, low);

		int[] pivotKey = a[low]; // 用第一个元素作为基准元素
		while (low < high) { // 两侧交替向中间扫描
			while (low < high && a[high][index] >= pivotKey[index])
				high--;
			a[low] = a[high];
			// swap(a, low, high); //比基准小的元素放到低端
			while (low < high && a[low][index] <= pivotKey[index])
				low++;
			a[high] = a[low];
			// swap(a, low, high); //比基准大的元素放到高端
		}
		a[low] = pivotKey; // 在中间位置放回基准值
		return low; // 返回基准元素所在位置
	}

	public static void swap(int[][] a, int i, int j) {
		int[] temp;
		temp = a[j];
		a[j] = a[i];
		a[i] = temp;
	}

}
