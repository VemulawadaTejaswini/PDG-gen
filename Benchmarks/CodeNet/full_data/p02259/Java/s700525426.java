
import java.util.Arrays;
import java.util.Scanner;

//冒泡排序：从最后一项到第二项，与前一项作比较，举例小于，当前项小于前一项前移
public class Main {
	public static int bubbleSort(int[] a) {
		boolean flag = true;//判断何时结束，遍历一次后没有交换，即每两个相邻元素都是前者小于后者
		int cnt = 0;
		int j = 1;//需要排序的是j的前一项
		//return 1;
		while (flag) {
			flag = false;//不交换，结束循环
			//从最后一项向第一项没排序的冒泡
			//确定顺序的数字不用排序
			for (int i = a.length - 1; i >= j; --i) {//最后一项开始，相邻的两个元素判断
				//满足条件交换
				if (a[i] < a[i - 1]) {//没有交换时结束循环
					int t = a[i];
					a[i] = a[i - 1];
					a[i - 1] = t;
					flag = true;
					cnt++;
				}
			}
			j++;
		}
		return cnt;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; ++i)
			a[i] = scan.nextInt();
		int cnt = bubbleSort(a);
		for (int i = 0; i < a.length; ++i) {
			System.out.print(a[i]);
			if (i != a.length - 1)
			System.out.print(" ");
		}
		System.out.println();
		System.out.println(cnt);
	}
}

