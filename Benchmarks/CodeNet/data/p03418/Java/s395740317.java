import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args)
	{
			Scanner in = new Scanner(System.in);
			int N = in.nextInt(), K = in.nextInt(), cnt = 0;

			for(int a = K; a <= N; a++)
			{
				for(int b = K; b <= N; b++)
				{
					if(b == 0)
						continue;
					int val = a % b;
					if(val >= K) {
						cnt++;
					}
				}
			}
			System.out.println(cnt);
	}
    
}