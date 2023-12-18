import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] ss = s.toCharArray();
		if(ss[2] == ss[3]) {
			if(ss[4] == ss[5]) {
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");
	}

}
