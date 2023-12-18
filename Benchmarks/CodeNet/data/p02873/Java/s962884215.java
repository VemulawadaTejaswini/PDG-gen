import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String S = sc.next();	//N-1文字
		int N = S.length() + 1;
		int A[] = new int[N];
		int a = 1;
		int first = 0;
		int last = 0;
		int out = 0;
		for(int i = 0; i < A.length; i++) {
			A[i] = -1;
		}
		for(int i = 0; i <= N-3; i++) {
			if(S.substring(i,i+2).equals("><")) {
				A[i+1] = 0;
			}
		}
		if(S.substring(0,1).equals("<")) {
			A[0] = 0;
			for(int i = 1; i <= N-2; i++) {
				A[i] = a;
				a++;
				first++;
				if(S.substring(i,i+1).equals(">")) {
					a = 1;
					break;
				}
			}
		}
		if(S.substring(N-2, N-1).equals(">")) {
			A[N-1] = 0;
			for(int i = N-2; i >= 1; i--) {
				A[i] = a;
				a++;
				last++;
				if(S.substring(i-1,i).equals("<")) {
					a = 1;
					break;
				}
			}
		}
		for(int i = first; i <= N-1-last; i++) {
			a = 1;
			if(A[i] == 0) {
				while(i-a >= 0 && S.substring(i-a,i-a+1).equals(">")) {
					if(A[i-a] <= a) {
						A[i-a] = a;
					}
					a++;
				}
				a = 1;
				while(i+a <= N-1 && S.substring(i+a-1,i+a).equals("<")) {
					if(A[i+a] <= a) {
						A[i+a] = a;
					}
					a++;
				}
				a = 1;
			}
		}
		for(int i = 0; i <= N-1; i++) {
			out += A[i];
		}
		System.out.println(out);
		sc.close();
	}
}