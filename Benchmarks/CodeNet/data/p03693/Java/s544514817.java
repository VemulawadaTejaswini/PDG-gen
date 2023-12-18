import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		int r = stdIn.nextInt();
		int g = stdIn.nextInt();
		int b = stdIn.nextInt();
		if((100*r+10*g+b) % 4 == 0)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}

	}

}
