import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String N = sc.nextLine();
		if(N.charAt(0)==N.charAt(2))
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}
