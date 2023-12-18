import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		long h = sc.nextInt();
		long w = sc.nextInt();
		
		if(h%3==0||w%3==0)
		{
			System.out.println(0);
			return;
		}
		
		long an = 999999999999999l;
		an = Math.min(h, w);
		
		//vertical first
		for(int x = 1; x < w; x++)
		{ //x: width of first piece
			long firstpiece = x*h;
			long secpiece = (w-x)*(h/2);
			long thirpiece = (w-x)*(h/2 + (h%2));
			long max = Math.max(firstpiece, secpiece);
			max = Math.max(max, thirpiece);
			long min = Math.min(firstpiece, secpiece);
			min = Math.min(min, thirpiece);
			an = Math.min(an, max-min);
			
//			System.out.println("x: " + x + ", " + max + ", " + min);
		}
		
		//horizontal first
		for(int y = 1; y < h; y++)
		{ //y: height of first piece
			long firstpiece = y*w;
			long secpiece = (h-y)*(w/2);
			long thirpiece = (h-y)*(w/2 + (w%2));
			long max = Math.max(firstpiece, secpiece);
			max = Math.max(max, thirpiece);
			long min = Math.min(firstpiece, secpiece);
			min = Math.min(min, thirpiece);
			an = Math.min(an, max-min);
		}
		
		System.out.println(an);
	}

}
