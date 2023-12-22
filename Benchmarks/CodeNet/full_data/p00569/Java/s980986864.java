import java.util.Scanner;

class SortedArray {
	private int[] array;
	private int pointer=0;

	//コンストラクタ
	public SortedArray(int i){
		array = new int[1];
		add(i);
	}

	public void add(int i) {
		//System.out.print("Array::::::::");for (int aa:array) System.out.print(aa+"  "); System.out.println();
		//System.out.println("P---------------"+pointer+"  /   " + array.length);
		if (pointer>0) {
			int[] a = new int[pointer+1];
			if (array[pointer-1]<=i) {
				for (int j=0; j<pointer; j++) a[j] = array[j];
				a[pointer] = i;
			} else {
				int lb = lowerBound(i);
				if (lb != 0)for (int j=0; j<lb; j++) a[j] = array[j];
				a[lb] = i;
				for (int j=lb+1; j<pointer+1; j++) a[j] = array[j-1];
			}
			array = a;
		} else array[0] = i;
		pointer++;
	}

	private int lowerBound(int target) {
		int low = 0;
		int high = pointer-1;  //最後

		while (low < high) {
			int mid = (high + low)/2;
			if (array[mid] == target) {
				return mid;
			}
			else if (array[mid] < target) low = mid + 1;
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
			SortedArray result = new SortedArray(200001);
			for (int i=0; i<n; i++) cards[i] = sc.nextInt();
			for (int i=number; i<= n; i++) {
				int start = 0;
				while (start + i <= n) {
					SortedArray sa = new SortedArray(cards[start]);
					for (int j=start+1; j<start + i; j++) sa.add(cards[j]);
					//System.out.print("copy::::::::::"); for (int j:sa.getArray())  System.out.print(j+" ");System.out.println("");
					result.add(sa.getArray()[number-1]);
					start++;
				}
			}
			System.out.println(result.getArray()[no-1]);
		}
	}
}
