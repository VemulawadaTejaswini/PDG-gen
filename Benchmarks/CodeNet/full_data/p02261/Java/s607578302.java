	import java.io.*;
import java.util.*;
	
	class Main {
		static BufferedReader br = new BufferedReader(new InputStreamReader(
				System.in));
		static StringBuilder out= new StringBuilder();
	
		public static void main(String[] args) throws IOException {
			int N = Integer.parseInt(br.readLine());
			String A1[] = br.readLine().split(" ");
			String A2[] = Arrays.copyOf(A1, N);
			bubblesort(A1, N);
			selectsort(A2, N);
			isstable(A1, A2);
		      out.append(A1[0]);
		        for(int i=1; i<A1.length; i++) out.append(' ').append(A1[i]);
		        out.append('\n');
		        out.append("Stable\n");
		        out.append(A2[0]);
		        for(int i=1; i<A2.length; i++) out.append(' ').append(A2[i]);
		        out.append('\n');
		        out.append(isstable(A1, A2)?"Stable\n":"Not stable\n");
		        System.out.print(out);
	
		}
	
		public static void bubblesort(String[] A, int N) {
			for (int i = 0; i < N-1; i++) {
				for (int j = N - 1; j > i; j--) {
					if (A[j].charAt(1) < A[j - 1].charAt(1)) {
						String tmp = A[j];
						A[j] = A[j - 1];
						A[j - 1] = tmp;
					}
				}
			}
		}
	
		public static void selectsort(String[] A, int N) {
			for (int i = 0; i < N; i++) {
				int min = i;
				for (int j = i+1; j < N; j++) {
					if (A[j].charAt(1) < A[min].charAt(1)) {
						min = j;
					}
				}
				if (i != min) {
					String t = A[i];
					A[i] = A[min];
					A[min] = t;
				}
			}
		}
	
		public static boolean isstable(String[] A1, String[] A2) {
			for (int i = 0; i < A1.length; i++) {
				if (A1[i].charAt(0) != A2[i].charAt(0)) {
					return false;
				}
			}
			return true;
		}
	}