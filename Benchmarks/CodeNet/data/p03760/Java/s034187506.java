import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		String o = scan.next();
		String e = scan.next();

		int l = 0;
		if(o.length()>=e.length()) {
			l = e.length();
		}else {
			l=o.length();
		}

		for(int i=0;i<l;i++) {
			System.out.print(o.charAt(i));
			System.out.print(e.charAt(i));
		}

		if(o.length()-e.length()==1) {
			System.out.println(o.charAt(o.length()-1));
		}
	}

}
