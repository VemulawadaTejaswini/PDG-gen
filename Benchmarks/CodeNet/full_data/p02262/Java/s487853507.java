import java.util.Scanner;


public class Main{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = Integer.parseInt(s.nextLine());
		int[] A = new int[n];
		for(int i=0 ; i<n ; i++) {
			A[i] = Integer.parseInt(s.nextLine());
		}
		shellSort(A, n);
		for(int i=0 ; i<n ; i++)
			System.out.println(A[i]);
	}

	public static void shellSort(int[] A, int n) {
		int m = 0;
		for(int i=0 ; i<n ; i=i*3+1){
			m++;
		}
		System.out.println(m);
		int[] G = new int[m];
		for(int i=0 ; i<G.length ; i++) {
			if(i==0)
				G[i] = 1;
			else
				G[i] = 3*G[i-1] + 1;
		}
		StringBuilder sb = new StringBuilder();
		int cnt = 0;
		for(int i=m-1 ; i>=0 ; i--) {
			sb.append(G[i] + " ");
			int re = insertionSort(A, n, G[i]);
			cnt += re;
		}
		System.out.println(sb.toString().trim());
		System.out.println(cnt);
	}

	public static int insertionSort(int[] A, int n, int g) {
		int cnt = 0;
		for(int i=g ; i<n ; i++) {
			int v = A[i];
			int j = i - g;
			while(j >= 0 && A[j] > v) {
				A[j+g] = A[j];
				j -= g;
				cnt++;
			}
			A[j+g] = v;
		}
		return cnt;
	}

}