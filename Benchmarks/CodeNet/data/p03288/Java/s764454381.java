import java.util.Scanner;


public class code {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int intNum = sc.nextInt();

		if(intNum<1200)
		{
			System.out.println("ABC");

			return;
		}

		if(intNum<2800)
		{
			System.out.println("ARC");

			return;
		}

		System.out.println("AGC");


	}

}
