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
		int[] in = new int[5];
		for(int i = 0;i<6;i++)
			in[file.nextInt()]++;
		int odd = 0;
		for(int x:in)
			if(x%2==1)
				odd++;
		System.out.println(odd == 2? "YES":"NO");
	}
	
}
