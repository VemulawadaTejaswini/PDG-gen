import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int n = Integer.parseInt(sc.next());
		if(n>=str.length()) {
			System.out.println(str);
		}else {
			System.out.println(str.substring(0,n)+"...");
		}

	}

}
