import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		String[] s = new String[n];
		int a=0;
		int b=0;
		int ba=0;
		int ab=0;
		int j;
		for(i=0; i<n; i++) {
			s[i] = sc.next();
			for(j=0; j<s[i].length()-1; j++){
				if(s[i].charAt(j) == 'A' && s[i].charAt(j+1) == 'B') {
					ab++;
					j++;
				}
			}
			if(s[i].charAt(0)=='B') {
				b++;
				if(s[i].charAt(s[i].length()-1)=='A') {
					ba++;
				}
			}
			if(s[i].charAt(s[i].length()-1)=='A') {
				a++;
			}
		}
		sc.close();
		sc = null;
		if(a==b && a==ba) {
			System.out.println(a+ab-1);
		} else {
			System.out.println(min(a, b)+ab);
		}
	}
}