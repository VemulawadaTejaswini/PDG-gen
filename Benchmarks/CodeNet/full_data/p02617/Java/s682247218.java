package ACB173;

import java.util.*;
import java.io.*;

public class f {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		long ans = 0;
		
		for(int i = 1; i <= n; i++)
			ans += i * (n - i + 1);
		
		for(int i = 1; i < n; i++)
		{
			int a = in.nextInt();
			int b = in.nextInt();
			int l = Math.min(a, b);
			int r = Math.max(a, b);
			ans -= l * (n - r + 1);
		}
		
		System.out.println(ans);

	}

}
