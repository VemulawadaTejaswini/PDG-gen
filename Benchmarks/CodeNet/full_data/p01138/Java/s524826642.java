import java.io.FileInputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
		
		Scanner sca = new Scanner(System.in);
		while(true)
		{
			int n = sca.nextInt();
			if(n == 0) break;
			
			int[] count = new int[24 * 60 * 60];
			int h, m, s;
			int i;
			int a, b, c;
			
			for(i = 0;i < 24*60*60;i++) count[i] = 0;
			
			for(i = 0;i < n;i++)
			{
				String text = sca.next();
				
				h = (text.charAt(0) - '0') * 10 + (text.charAt(1) - '0');
				m = (text.charAt(3) - '0') * 10 + (text.charAt(4) - '0');
				s = (text.charAt(6) - '0') * 10 + (text.charAt(7) - '0');
				
				text = sca.next();
				a = (text.charAt(0) - '0') * 10 + (text.charAt(1) - '0');
				b = (text.charAt(3) - '0') * 10 + (text.charAt(4) - '0');
				c = (text.charAt(6) - '0') * 10 + (text.charAt(7) - '0');
				
				int start = h * 60 * 60 + m * 60 + s;
				int end = a * 60 * 60 + b * 60 + c;
				
				for(start++;start < end - 1;start++) count[start]++;
			}
			
			int max = 0;
			
			for(i = 0;i < 24*60*60;i++)
				if(count[i] > max) max = count[i];
			
			System.out.println(max);
		}
	}
}