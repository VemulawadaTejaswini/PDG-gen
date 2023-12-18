import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args)
	{
			Scanner in = new Scanner(System.in);
			int n = in.nextInt(), d = in.nextInt(), x = in.nextInt();
			int A[] = new int[n];  
			for(int i = 0; i < n; i++)
				A[i] = in.nextInt();

			int ans = 0;

			for(int i = 0; i < n; i++)
			{
				int val = 0;
				int coeff = 0;
				while(val <= d)
				{
					val = coeff * A[i] + 1;
					if(val > d)
						break;
					coeff++;
					ans += 1;
				}
			}
			ans += x;
			System.out.println(ans);
	}
    
}