import java.io.*;
import java.math.*;
import java.util.*;
public class Main { 

	public static void main(String[] args) { //GIMME AC
		Scanner input = new Scanner(System.in); 
		String S = input.next();
		int N = S.length();
		String ans = "";
		boolean[] v = new boolean[200];
		if (N<26) {
			ans+=S;
			for (int i = 0; i < N; i++) {
				v[(int)(S.charAt(i))]=true;
			}
			for (int i = (int)('a'); i <= (int)('z'); i++) {
				if (!v[i]) {
					ans+=Character.toString((char)(i));
					break;
				} 
			}
		}else {
			int L = -1; //L=0 is still valid dawg
			for (int R = N-2; R >= 0; R--) {
				if ((S.charAt(R))>(S.charAt(R+1))) continue;
				else {
					L=R;
					break;
				}
			}
			if (L==-1) ans="-1";
			else {
				ans+=S.substring(0,L);
				char cmp = S.charAt(L);
				for (int i = 0; i < L; i++) {
					v[(int)(ans.charAt(i))]=true;
				}
				for (int i = (int)('a'); i <= (int)('z'); i++) {
					if (!v[i]&&i>(int)(cmp)) {
						ans+=Character.toString((char)(i));
						break;
					}
				}
			}
		}
		System.out.println(ans);
	}
}