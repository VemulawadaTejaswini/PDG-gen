import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char[] s = sc.next().toCharArray();
		int N = s.length;
		
		long ans = 0;
		
		int acount = 0;
		for(int i=0; i<N; i++) {
			if(s[i]=='A') {
				acount++;
			} else if(s[i]=='B') {
				if(i+1<N && s[i+1]=='C') {
					ans += acount;
					i++;
				}
			} else {
				acount = 0;
			}
		}
		
		System.out.println(ans);
		sc.close();
	}
}
