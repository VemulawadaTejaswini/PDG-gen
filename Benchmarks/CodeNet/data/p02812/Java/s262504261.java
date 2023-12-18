import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

	Scanner sca = new Scanner(System.in);
	// 入力
	int n = sca.nextInt();
	String s = sca.next();
	int ans = 0;
	for(int i = 0; i < s.length()-2; i++) {
		if(s.charAt(i) == 'A') {
			if(s.charAt(i+1) == 'B' && s.charAt(i+2) == 'C') {
				ans++;
			}
		}
	}

	System.out.println(ans);

	// 後始末
	sca.close();
	}
}