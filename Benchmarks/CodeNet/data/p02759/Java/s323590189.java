import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int n;
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		System.out.println(n%2==0 ? n/2:(n/2)+1);

	}

}
