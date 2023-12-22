import java.util.Scanner;

class Main {
	public static int cnt=0;
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] c = new int[n];
		for (int i = 0; i < n; i++) {
			c[i] = in.nextInt();
		}
		shellSort(c,n);
		in.close();
	}

	private static void insertionSort(int[] A, int n, int g) {
		int v;
		int j;

	      for (int i = g; i < n; i++) {
	          v = A[i];
	          j = i - g;
	          while (j >= 0 && A[j]  > v) {
	              A[j+g] = A[j];
	              j = j - g;
	              cnt+=1;
	              A[j+g] = v;
	          }
	      }
	}

	private static void shellSort(int[] A, int n) {
		 int m=1;
		 int[] G= {1};
	     for (int i = 0; i < m; i++) {
	         insertionSort(A, n, G[i]);
	     }
	     System.out.println(m);
	     System.out.println(G[0]);
	     System.out.println(cnt);
	     for (int i = 0; i < n; i++) {
	    	 System.out.println(A[i]);
	     }
	}



}

