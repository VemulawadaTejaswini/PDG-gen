import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		String moji = stdIn.next();
		if(moji.length() < n) {
			System.out.println(moji);
		}else {
			System.out.println(moji.substring(0,n) + "...");
		}
	}

}
