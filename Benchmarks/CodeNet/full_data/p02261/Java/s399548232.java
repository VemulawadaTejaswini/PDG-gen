import java.util.*;

public class Main {	
	
	Scanner sc = new Scanner(System.in);
	
	
	void run() {
		int N = sc.nextInt();
		String []in1 = new String[N];
		String []in2 = new String[N];
		for (int i = 0; i < N; i++) {
			String s = sc.next();
			in1[i] = s;
			in2[i] = s;
		}
		bubble(in1, N);
		selection(in2, N);
		System.out.println(match(in1, in2) ? "Stable" : "Not stable");
		
	}
	
	void bubble(String A[], int N) {
		for (int i = 0; i < N; i++) {
			for(int j = N-2; j > i;j--) {
				if(A[j].charAt(1) > A[j+1].charAt(1)) {
					String t = A[j];
					A[j] = A[j+1];
					A[j+1] = t;
				}
			}
		}
		for (int i = 0; i < N; i++) {
			System.out.print((i == 0 ? "" : " ")+ A[i]);
		}
		System.out.println();
		System.out.println("Stable");
	}
	
	void selection(String A[], int N) {
		for(int i = 0; i < N-1; i++) {
			int min = N-1;
			for(int j = N - 2; j >= i; j--) {
				if (A[j+1].charAt(1) > A[j].charAt(1)) {
					min = j;
				}
			}
			String t = A[i];
			A[i] = A[min];
			A[min] = t;
		}
		for (int i = 0; i < N; i++) {
			System.out.print((i == 0 ? "" : " ") + A[i]);
		}
		System.out.println();
	}
	
	boolean match(String[] s1, String[] s2) {
		for (int i = 0; i < s1.length; i++ ) {
			if(!s1[i].equals(s2[i])) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
	
}

