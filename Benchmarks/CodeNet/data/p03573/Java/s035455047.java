import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		
		int A = stdIn.nextInt();
		int B = stdIn.nextInt();
		int C = stdIn.nextInt();
		
		if(A == B)
		{
			System.out.println(C);
		}
		else if(A == C)
		{
			System.out.println(B);
		}
		else
		{
			System.out.println(A);
		}

	}

}
