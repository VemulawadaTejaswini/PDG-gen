import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {

	public static void main(String[] args)
	{
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			int[] axis = new int[n]; 
			for(int i = 0; i < n; i++)
				axis[i] = in.nextInt();
			for(int i = 0; i < n; i++)
			{
				int dep = 0;
				int ans = 0, cpt = 0;
				for(int j = 0; j < n; j++)
				{
					if(j == i)
						continue;

					ans += Math.abs(dep - axis[j]);
					dep = axis[j];
					cpt = j;
				}
				ans += Math.abs(0 - axis[cpt]);
				System.out.println(ans);
			}
	}
    
}