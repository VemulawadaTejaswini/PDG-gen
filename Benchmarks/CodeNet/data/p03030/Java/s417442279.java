import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] n = new int[N];
		String[] S = new String[N];
		int[] P = new int[N];
		for(int i = 0; i < N; i++) {
			n[i] = i+1;
			S[i] = sc.next();
			P[i] = sc.nextInt();
		}
		while(true) {
			boolean ok = true;
			for(int i = 0; i < N-1;i++) {
				if(S[i].compareTo(S[i+1]) >= 1) {
					String t = S[i];
					S[i] = S[i+1];
					S[i+1] = t;
					int v = n[i];
					n[i] = n[i+1];
					n[i+1] = v;
					int w = P[i];
					P[i] = P[i+1];
					P[i+1] = w;
					ok = false;
				}
			}
			if(ok)
				break;
		}
		while(true) {
			boolean ok = true;
			for(int i = 0; i < N-1;i++) {
				if(S[i].equals(S[i+1]) && P[i] < P[i+1]) {
					String t = S[i];
					S[i] = S[i+1];
					S[i+1] = t;
					int v = n[i];
					n[i] = n[i+1];
					n[i+1] = v;
					int w = P[i];
					P[i] = P[i+1];
					P[i+1] = w;
					ok = false;
				}
			}
			if(ok)
				break;
		}
		for(int i = 0; i < N; i++)
			System.out.println(n[i]);
	}

}