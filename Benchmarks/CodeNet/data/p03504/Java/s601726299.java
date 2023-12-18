import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		@SuppressWarnings("unused")
		int c = sc.nextInt();
		int s[] = new int[n];
		int t[] = new int[n];
		for(int i=0; i<n; i++) {
			s[i] = sc.nextInt()-1; // 1 <= s
			t[i] = sc.nextInt()-1; // 1 < t
			c = sc.nextInt();
		}
		sc.close();
		int len = 0;
		for(int i=0; i<t.length; i++) {
			if(len < t[i]) len = t[i];
		}
		int ary[] = new int[len+2];
		
		for(int i=0; i<n; i++) {
			ary[s[i]]++;
			ary[t[i]+1]--;
		}
		
		for(int i=1; i<ary.length; i++) {
			ary[i] += ary[i-1];
		}
		
		int ans = 0;
		for(int i=0; i<ary.length; i++) {
			if(ans < ary[i]) ans = ary[i];
		}
		
		System.out.println(ans);
	}

}