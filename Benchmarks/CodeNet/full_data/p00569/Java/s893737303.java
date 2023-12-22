import java.util.Scanner;

class SortedArray {
	private int[] array;
	private int pointer=1;
	private int target;  //この数字以降はソートしない

	//コンストラクタ
	public SortedArray(int i, int t){
		target = t;
		array = new int[t];  //その以降いらない
		array[0] = i;
	}

	public void add(int i) {
		//System.out.print("Array::::::::");for (int aa:array) System.out.print(aa+"  "); System.out.println();
		//System.out.println("P---------------"+pointer+"  /   " + array.length);
		int[] a = new int[pointer+1];
		if (array[pointer-1]<=i) {  //iが一番大きい数字だったら
			for (int j=0; j<pointer; j++) a[j] = array[j];
			a[pointer] = i;
		} else if (target<pointer) {
			if (array[target-1]<=i) {  //最初のtarget番目より大きいだったら
				a = array;
				pointer--;  //プラマイゼロ
			} else {
				int lb = lowerBound(i);
				if (lb != 0)for (int j=0; j<lb; j++) a[j] = array[j];
				a[lb] = i;
				for (int j=lb+1; j<pointer+1; j++) a[j] = array[j-1];
			}
		}else {
			int lb = lowerBound(i);
			if (lb != 0)for (int j=0; j<lb; j++) a[j] = array[j];
			a[lb] = i;
			for (int j=lb+1; j<pointer+1; j++) a[j] = array[j-1];
		}
		array = a;
		pointer++;
	}

	private int lowerBound(int t) {
		int low = 0;
		int high;
		
		if (target<pointer) high = target-1;  //最後
		else high = pointer-1;  //最後

		while (low < high) {
			int mid = (high + low)/2;
			if (array[mid] == t) {
				return mid;
			}
			else if (array[mid] < t) low = mid + 1;
			else high = mid;
		}
		return high;
	}

	//---------------------------------------------

	public int[] getArray() { return array; }
}

class Main {


	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)){
			int n = sc.nextInt();
			int number = sc.nextInt(); //枚数
			int no = sc.nextInt();  //何番目
			int[] cards = new int[n];
			SortedArray result = new SortedArray(200001,no);
			for (int i=0; i<n; i++) cards[i] = sc.nextInt();  //読み込む
			for (int i=0; i<= n-number; i++) {
				SortedArray sa = new SortedArray(cards[i],number);
				for (int k=i+1; k<i + number; k++) sa.add(cards[k]);
				//System.out.print("copy::::::::::"); for (int l:sa.getArray())  System.out.print(l+" ");System.out.println("");
				result.add(sa.getArray()[number-1]);
				for (int j=i+number; j<n; j++ ) {
					sa.add(cards[j]);
					//System.out.print("copy::::::::::"); for (int l:sa.getArray())  System.out.print(l+" ");System.out.println("");
					result.add(sa.getArray()[number-1]);
				}
			}
			System.out.println(result.getArray()[no-1]);
		}
	}
}

