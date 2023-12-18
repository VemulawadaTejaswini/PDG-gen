import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		
		int X = stdIn.nextInt();
		int t = stdIn.nextInt();
		
		if(X-t >= 0)
		{
			System.out.println(X-t);
		}
		else
		{
			System.out.println(0);
		}

	}

}
