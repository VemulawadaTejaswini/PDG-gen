
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		
		String []s = new String [n];
		int anum = 0;;
		int []ab = new int [n];
		int bnum = 0;
		
		for(int i = 0 ; i < n ;i++) {
			s[i] = sc.next();
		}
		
		for(int i = 0 ; i < n ; i++) {
			if(s[i].charAt(0) =='B') bnum++;
			if(s[i].charAt(s[i].length()-1) == 'A'){
				anum++;
			}
			for(int j = 0 ; j < s[i].length()-1 ; j++) {
				if(s[i].charAt(j) == 'A' && s[i].charAt(j+1) == 'B') ab[i]++;
			}
		}
		
		
		int ans = 0;
		
		for(int i = 0; i < n ;i++) {
			ans += ab[i];
		}
		if(anum == n && bnum == n) {
			ans += n-1;
		}
		else {
			ans += Math.min(anum, bnum);
		}
		System.out.println(ans);
		
	}

}
