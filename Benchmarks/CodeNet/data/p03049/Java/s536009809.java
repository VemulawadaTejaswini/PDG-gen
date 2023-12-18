import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] s = new String[N];
		int ans = 0;
		int enda = 0, startb = 0;
		for(int i = 0; i < N; i++) {
			s[i] = sc.next();
			if(s[i].charAt(0) == 'B')
				startb++;
			if(s[i].charAt(s[i].length()-1) == 'A')
				enda++;
			for(int j = 0; j < s[i].length()-1; j++) {
				if(s[i].charAt(j) == 'A' && s[i].charAt(j+1) == 'B')
					ans++;
			}			
		}
		System.out.println(ans + Math.min(enda, startb));

	}

}