import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		Sub sub = new Sub();
	}

	static class Sub
	{
		int i;
		public Sub()
		{
			Scanner scanner = new Scanner(System.in);
			i = scanner.nextInt();
			System.out.println(i*i*i);
		}
	}
}

