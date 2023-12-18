//package abc056b;

import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int w, a, b, x = 0, y = 0, ans = 0;
		Scanner sc = new Scanner(System.in);
		w = sc.nextInt();
		a = sc.nextInt();
		b = sc.nextInt();
		
		x = a + w;
		y = b + w;
		if(y < a)
		{
			ans = a - y;
		}
		else if (y == a)
		{
			ans = 0;
		}
		else if(b == x)
		{
			ans = 0;
		}
		else if(b > x)
		{
			ans = b - x;
		}
		else
		{
			ans = 0;
		}
			
				System.out.println(ans);

	}

}
