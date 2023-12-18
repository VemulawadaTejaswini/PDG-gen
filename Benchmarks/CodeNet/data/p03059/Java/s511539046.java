import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main{
	
	public static void main(String[] args)
	{
		new Main().run();
	}
	
	public void run()
	{
		Scanner file = new Scanner(System.in);
		int A = file.nextInt();
		int B = file.nextInt();
		int T = file.nextInt();
		System.out.println(T/A*B);
	}
	
}
