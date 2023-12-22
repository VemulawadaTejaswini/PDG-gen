import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] c = new int[n];
		for (int i = 0; i < n; i++) {
			c[i] = in.nextInt();
		}
		bubbleSort(c);
		in.close();
	}

	private static void bubbleSort(int[] A) {
		int flg = 1;
		int wk;
		int count=0;
		while (flg == 1) {
			flg = 0;
			for (int i = A.length - 1; i > 0; i--) {
				wk = A[i - 1];

				if (A[i] < A[i - 1]) {
					A[i - 1] = A[i];
					A[i] = wk;
					count+=1;
					flg=1;
				}
			}

		}
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<A.length;i++) {
			if(i>0) {
				sb.append(" ");
			}
			sb.append(A[i]);

		}
		System.out.println(sb.toString());
		System.out.println(count);
	}

}

