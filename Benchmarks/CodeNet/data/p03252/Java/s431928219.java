import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		char s[] = sc.next().toCharArray();
		int ss[] = new int[s.length];
		int sa[] = new int[26];
		char t[] = sc.next().toCharArray();
		int tt[] = new int[t.length];
		int ta[] = new int[26];

		int si=1;
		int ti=1;
		for(int i=0; i<s.length; i++) {

			if(sa[s[i]-'a'] ==0) {
				sa[s[i]-'a']=si++;
			}
			ss[i]=sa[s[i]-'a'];


			if(ta[t[i]-'a'] ==0) {
				ta[t[i]-'a']=ti++;
			}
			tt[i]=ta[t[i]-'a'];
		}
		int j=0;
		for(; j<s.length; j++) {
			if(ss[j] != tt[j]) break;
		}
		if(j == s.length) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		sc.close();
	}
}
