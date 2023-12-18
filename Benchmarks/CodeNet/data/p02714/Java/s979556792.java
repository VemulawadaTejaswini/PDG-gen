import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n;
		String S;
		try(Scanner sc = new Scanner(System.in)) {
			n = sc.nextInt();
			S = sc.next();
		}
		char[] s = S.toCharArray();
		
		// 1を起点に2,4567.. 3,4678..
		// 2を起点に3,567.. 4,578..
		
		int count = 0;
		// 起点
		for(int i = 0; i < n; i++) {
			// 2番目
			for(int j = i + 1; j < n; j++) {
				if(s[i] == s[j]) {
					continue;
				}
				for(int k = j + 1; k < n; k++) {
					if(k - j == j - i) {
						continue;
					}
					if(s[k] == s[i] || s[k] == s[j]) {
						continue;
					}
					count++;
				}
			}
		}
		
		System.out.println(count);
	}


}
