import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] A = new String[N];
		String ans = "NO";
		
		for (int i=0; i<N; i++) {
			A[i] = sc.next();
		}
		
		for (int i=0; i<N; i++) {
			for (int j=i+1; j<N; j++) {
				if (A[i].equals(A[j])) {
					ans = "NO";
					break;
				} else {
					ans = "YES";
				}
			}
			if (ans.equals("NO")) {
				break;
			}
		}
		
		System.out.println(ans);
	}
}
