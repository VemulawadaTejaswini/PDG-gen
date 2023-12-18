import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		String s1 = scan.next();
		String s2 = scan.next();
		String s3 = scan.next();

		String s =s1.substring(0,1);
		s+=s2.substring(0,1);
		s+=s3.substring(0,1);

		String S =s.toUpperCase();
		System.out.println(S);
	}

}
