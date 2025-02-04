import java.util.Scanner;


public class Main 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		int w = scanner.nextInt();
		int n = scanner.nextInt();
		
		int[] m = new int[w];
		for(int i=0; i<w; i++)
		{
			m[i] = i+1;
		}
		
		for(int i=0; i<n; i++)
		{	
			String s = scanner.next();
			int a = Integer.parseInt(s.substring(0, 1)) -1;
			int b = Integer.parseInt(s.substring(s.length()-1, s.length())) -1;
			
			int buf = m[a];
			m[a] = m[b];
			m[b] = buf;
		}
		
		for(int i=0; i<w; i++)
		{
			System.out.printf("%1$d%2$s",m[i], w-1==i?"":"\n");
		}
	}
}