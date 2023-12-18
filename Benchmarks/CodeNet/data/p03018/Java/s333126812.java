
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[]s = sc.next().toCharArray();
		int n =  s.length;
		
		int alen = 0;
		int ans = 0;
		
		for(int i = 0 ; i < n-1 ;i++) {
			if(s[i] == 'A') {
				alen++;
			}
			
			if(s[i] == 'B' && s[i+1] == 'C') {
				ans += alen;
				if(alen >= 2) {
					s[i] = 'A'; s[i+1] ='A';
					alen--;
				}
				else {
					s[i+1] = 'A';
					alen = 0;
				}
			}
			else if(s[i] != 'A') {
				alen = 0;
			}
			//System.out.println(alen+" "+ans);
		}
		System.out.println(ans);
	}

}
