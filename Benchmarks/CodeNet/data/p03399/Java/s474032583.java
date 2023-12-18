import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args)
	{
			Scanner in = new Scanner(System.in);
			int A = in.nextInt(), B = in.nextInt(), C = in.nextInt(), D = in.nextInt(), ans = 0;

			ans = ((A < B) ? A : B ) + ((C < D) ? C : D);
			System.out.println(ans);
	}
    
}