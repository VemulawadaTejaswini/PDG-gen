import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int[] ary = new int[n];
		for (int i=0; i<n; i++) {
			ary[i] = stdIn.nextInt();
		}
		output(ary);
		for (int i=1; i<ary.length; i++) {
			int key = ary[i];
			int j = i - 1;
			while (j>=0 && ary[j]>key) {
				ary[j+1] = ary[j];
				j--;
			}
			ary[j+1] = key;
			output(ary);
		}
	}
	static void output(int[] a) {
		for (int i=0; i<a.length; i++) {
			System.out.print(a[i]);
			if(i<a.length-1)
				System.out.print(" ");
			else 
				System.out.println();
		}
	}
}