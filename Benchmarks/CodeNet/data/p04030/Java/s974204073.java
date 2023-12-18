import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		StringBuilder show = new StringBuilder();
		int countB = 0;
		for (int i=0;i<s.length();i++) {
			if(s.charAt(i)=='B') {
				if(show.length()>0) {
				show.deleteCharAt(show.length()-1);
				}
			}else {
		show.append(s.charAt(i));
		}
	}
		System.out.println(show);

	}
}

