import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		String r=scan.next();
		String g = scan.next();
		String b = scan.next();
		String rbg = r+g+b;
		int rbgI = Integer.parseInt(rbg);
		if(rbgI%4==0) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}

}
