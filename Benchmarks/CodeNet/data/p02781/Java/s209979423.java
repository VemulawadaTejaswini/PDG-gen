import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		int k = sc.nextInt(); long ans = 0;
		if(k==1) {
			ans = (s.length-1)*9+s[0]-'0';
		}else if(k==2) {
			if(s.length>=2) {
				for (int i = 2; i < s.length; i++) {
					ans += 9*9*(i-1);
				}
				ans += (s[0]-'0'-1)*9*(s.length-1);
				int j = 1;
				for (int i = 1; i < s.length; i++) {
					if(s[i]=='0') j++;
					else break;
				}
				ans += 9*(s.length-1-j)+(s[j]-'0');
			}
		}else {
			if(s.length>=3) {
				for (int i = 3; i < s.length; i++) {
					ans += 9*9*9*(i-1)*(i-2)/2;
				}
				ans += (s[0]-'0'-1)*9*9*(s.length-1)*(s.length-2)/2;
				int l = 1; int m = 2; boolean flag = false;
				for (int i = 1; i < s.length; i++) {
					if(flag) {
						if(s[i] != 0) {
							break;
						}else {
							m++;
						}
					}else {
						if(s[i] == 0) {
							l++;
						}else {
							m = l+1;
							flag = true;
						}
					}
				}
				if(m >= s.length) {
					if(l<s.length) {
						ans += (s[l]-'0'-1)*9*(s.length-l-1);
					}
				}else {
					ans += (s[l]-'0'-1)*9*(s.length-l-1);
					ans += 9*(s.length-m-1)+(s[m]-'0');
					ans += 9*9*(s.length-m-1)*(s.length-m-2)/2;
					ans += (s[m]-'0')*(s.length-m-1)*9;
				}
			}
		}
		System.out.println(ans);
		sc.close();
	}
}