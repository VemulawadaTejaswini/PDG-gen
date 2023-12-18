import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int num = c - a - b;
		//c < a + bならば絶対にNo
		if (num < 0)  { 
			System.out.println(“No”);
		}

		
		if(num * num > 4 * a * b) {
			System.out.print("Yes");
		} else {
			System.out.println("No");
		}
	}

}