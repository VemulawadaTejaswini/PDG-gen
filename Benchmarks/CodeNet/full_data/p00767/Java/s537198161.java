
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main 
{
	static class C implements Comparator<Rec>
	{

		@Override
		public int compare(Rec arg0, Rec arg1) 
		{
			int a = arg0.w * arg0.w + arg0.h * arg0.h;
			int b = arg1.w * arg1.w + arg1.h * arg1.h;
			
			if(a - b != 0)return a-b;
//			return (a-b)*1000 + (arg0.h - arg1.h);
			
			return arg0.h - arg1.h;
		}
		
	}
	
	static class Rec
	{
		int h = 0;
		int w = 0;
		
		public Rec(int h0, int w0)
		{
			h = h0;
			w = w0;
		}
	}

	public static void main(String[] args) 
	{
		Rec[] a = new Rec[125250];
		int z = 0;
		
		for(int h = 1; h <= 501; h++)
		{
			for(int w = h+1; w <= 501; w++)
			{
				a[z] = new Rec(h,w);
				z++;
			}
		}
		
//		System.out.println(z);
		
		C c = new C();
		
		Scanner sc = new Scanner(System.in);
		
		Arrays.sort(a, c);

		
		while(true)
		{
			int h = sc.nextInt();
			int w = sc.nextInt();
			
			if(h == 0 && w == 0)return;
			
			for(int i = 0; i < 125250; i++)
			{
				if(a[i].w == w && a[i].h == h)
				{
					System.out.println(a[i+1].h + " " + a[i+1].w);
					break;
				}
			}
		}
		

	}

}

