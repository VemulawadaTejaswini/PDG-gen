import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int[] ary = new int[n];

		for (int i=0; i<n; i++) {
			ary[i] = stdIn.nextInt();
		}

		int count = 0;
		for (int i=0; i<ary.length; i++) {
			for (int j=ary.length-1; j>i; j--) {
				if (ary[j] < ary[j-1]) {
					swap(ary,j,j-1);
					count++;
				}
			}
		}

		for (int i=0; i<ary.length-1; i++) {
			System.out.print(ary[i] + " ");
		}
		System.out.println(ary[ary.length-1]);
		System.out.println(count);
	}

	static void swap(int[] ary,int x,int y){
		int temp = ary[x];
		ary[x] = ary[y];
		ary[y] = temp;
	}
}