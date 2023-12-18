import java.util.Scanner;

class Main{
	static boolean check(String[] A, String[] B) {
		boolean isMatched = false;
		for(int i = 0; i + B.length <= A.length; i++) {
			for(int j = 0; j + B.length <= A.length; j++) {
				//matching
				int matchedline = 0;
				for(int k = i; k < B.length; k++) {
					if(B[k].equals(A[k].substring(j, j + B.length))) {
						matchedline++;
					}
				}
				if(matchedline == B.length) isMatched = true;
			}
		}
		return isMatched;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), M = sc.nextInt();
		String[] A = new String[N];
		String[] B = new String[M];
		for(int i = 0; i < N; i++) A[i] = sc.next();
		for(int i = 0; i < M; i++) B[i] = sc.next();
		System.out.println(check(A, B) ? "Yes" : "No");
	}
}