import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		System.out.println("英小文字を１字入力せよ。");
		Scanner scan = new Scanner(System.in);
		String x = scan.next();
		
		if(x.equals("a") || x.equals("e") || x.equals("i")
				||x.equals("o")|| x.equals("u")) {
			System.out.println("vowel");
		}else {
			System.out.println("consonant");
		}
	}

}
