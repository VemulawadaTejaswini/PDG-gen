import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	int n;
	char s[];
	public void run() {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		s = sc.next().toCharArray();
		String ans = "";
		int c1=0;
		int c2=0;

		int i=0;
		while(i<n) {
			if(s[i]=='(') {
				c1++;
				i++;
			}else {
				while(i<n && s[i]==')') {
					c2++;
					i++;
				}
				String tmp="";
				while(c2>0) {
					tmp = tmp + ")";
					if(c1>0) {
						tmp = "("+tmp;
						c1--;
					}else {
						ans = "("+ans;
					}
					c2--;
				}
				ans = ans + tmp;
			}
		}
		String tmp = "";
		while(c1>0) {
			tmp = "(" + tmp + ")";
			c1--;
		}
		ans = ans + tmp;
		System.out.println(ans);
		sc.close();
	}


}


