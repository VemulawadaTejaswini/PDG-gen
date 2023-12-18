import java.util.Scanner;

public class Main {



	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scan = new Scanner(System.in);

		String N = scan.next();
		if(N.length()==3) {
			if(N.contains("7")) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}		
		}

	}
}
