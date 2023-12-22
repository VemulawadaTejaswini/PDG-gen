import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int area = a*b;
		int len = 2 * (a + b);
		System.out.println(area + " " + len);
		
	}

}

