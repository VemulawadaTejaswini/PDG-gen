import java.util.Scanner;

public class Main {
	
	static long[] maxPas = new long[5];
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] L = new int[M];
		int[] R = new int[M];
		for(int i=0; i<M; i++) {
			L[i] = sc.nextInt();
			R[i] = sc.nextInt();
		}
		
		int Lmax = max(L);
		int Rmin = min(R);
		
		if(Rmin >= Lmax) {
			System.out.println(Rmin - Lmax + 1);
		} else {
			System.out.println(0);
		}
		
		
	}
	
	private static int max(int[] a) {
		int max = a[0];
		for(int i=0; i<a.length; i++) {
			int v = a[i];
			if(v>max) {
				max = v;
			}
		}
		return max;
	}

	private static int min(int[] a) {
		int min = a[0];
		for(int i=0; i<a.length; i++) {
			int v = a[i];
			if(v<min) {
				min = v;
			}
		}
		return min;
	}

}
