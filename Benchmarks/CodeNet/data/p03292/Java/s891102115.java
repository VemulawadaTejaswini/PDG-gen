import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);

		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		int c = stdIn.nextInt();

		int max = a;
		int min = a;

		if(max < b)
		{
			max = b;
		}
		if(min > b)
		{
			min = b;
		}
		if(max < c)
		{
			max = c;
		}
		if(min > c)
		{
			min = c;
		}

		System.out.println(max - min);

	}

}
