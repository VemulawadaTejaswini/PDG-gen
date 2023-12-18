

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdin = new Scanner(System.in);
		int n = stdin.nextInt();
		String s =stdin.next();
		int k = stdin.nextInt();
		char[] c = s.toCharArray();
		for(int i = 0;i<n;i++) {
			if(c[i]!=c[k-1]) {
				c[i]='*';
			}
		}
		for(int i = 0;i<n;i++) {
			System.out.print(c[i]);
		}


	}

}
