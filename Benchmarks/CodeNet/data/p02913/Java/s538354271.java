import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		char[] s = new char[(N+1)/2];
		char[] t = new char[N/2];
		for(int i = 0; i < (N+1)/2; i++)
			s[i] = S.charAt(i);
		for(int i = (N+1)/2; i < N; i++)
			t[i-(N+1)/2] = S.charAt(i);
		int ans = 0;
		for(int i = 0; i < (N+1)/2; i++) {
			int x = 0;
			int p = 0;
			for(int j = (N+1)/2-1-i; j < (N+1)/2; j++) {
				if(s[j] == t[p])
					x++;
				ans = Math.max(ans, x);
				if(s[j] != t[p])
					x = 0;
				p++;
				if(p >= N/2)
					break;
			}
		}
		char[] u = new char[N/2];
		char[] v = new char[(N+1)/2];
		for(int i = 0; i < N/2; i++)
			u[i] = S.charAt(i);
		for(int i = N/2; i < N; i++)
			v[i-N/2] = S.charAt(i);
		for(int i = 0; i < (N+1)/2; i++) {
			int x = 0;
			int p = 0;
			for(int j = (N+1)/2-1-i; j < (N+1)/2; j++) {
				if(v[j] == u[p])
					x++;
				ans = Math.max(ans, x);
				if(v[j] != u[p])
					x = 0;
				p++;
				if(p >= N/2)
					break;
			}
		}
		System.out.println(ans);

	}

}