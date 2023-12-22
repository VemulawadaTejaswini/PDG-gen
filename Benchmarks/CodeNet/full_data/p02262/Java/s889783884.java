import java.util.*;

class Main {

	static int count = 0;

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int[] A = new int[n];
		for (int i=0; i<n; i++) {
			A[i] = stdIn.nextInt();
		}

		shellSort(A,n);

		System.out.println(count);	
		for (int i=0; i<n; i++) {
			System.out.println(A[i]);
		}
	}

	static void insettionSort(int[] A,int n,int g) {
		for (int i=g; i<n; i++) {
			int temp = A[i];
			int j = i-g;
			while (j>=0 && A[j]>temp) {
				A[j+g] = A[j];
				j = j-g;
				count++;
			}
			A[j+g] = temp;
		}
	}

	static void shellSort(int[] A,int n) {
		int h = 0;		
		int m;
		int[] G;

		for (m=1; m<n/27; m=m*3+1)
			h++;
		h++;
		System.out.println(h);
		G = new int[h];
		for (int i=0; i<h && m>0; i++,m/=3)
			G[i] = m;

		for (int i=0; i<h-1; i++) {
			System.out.print(G[i]+" ");
		}
		System.out.println(G[h-1]);

		for (int i=0; i<h; i++) {
			insettionSort(A,n,G[i]);
		}
		
	}

	static void swap(String[] ary,int x,int y){
		String temp = ary[x];
		ary[x] = ary[y];
		ary[y] = temp;
	}
}