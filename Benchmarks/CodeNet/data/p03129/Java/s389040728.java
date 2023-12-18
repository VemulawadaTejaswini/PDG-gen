import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main{
	
	public static void main(String[] args)
	{
		new Main().run();
	}
	
	public void run()
	{
		Scanner file = new Scanner(System.in);
		int N = (file.nextInt()+1)/2;
		int K = file.nextInt();
		System.out.println(N>=K? "YES":"NO");
	}
	
}
