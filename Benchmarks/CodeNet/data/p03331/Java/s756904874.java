import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		char[] n = String.valueOf(scanner.nextInt()).toCharArray();
		int ans = 0;
		for(int i = 0; i < n.length; i++) {
			if(n[0] == '1' && n[1] == '0' && i == 0 ) {
				ans += (n[i] - '0') * 10;
			}else {
				ans += n[i] - '0';
			}
		}		
		System.out.println(ans);
	
	}

}