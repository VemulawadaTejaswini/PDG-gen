import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		
		int X = stdIn.nextInt();
		int A = stdIn.nextInt();
		int B = stdIn.nextInt();
		
		X -= A;
		
		while(X >= B)
		{
			X -= B;
		}
		
		System.out.println(X);

	}

}
