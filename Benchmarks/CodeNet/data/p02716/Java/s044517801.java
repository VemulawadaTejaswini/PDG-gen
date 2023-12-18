import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		long[] a = new long[n];
		
		long[] sumo = new long[n];
		long[] sumx = new long[n];
		//assume n is odd
		long curso = 0; long cursx = 0;
		for(int i = 0; i < n; i++)
		{
			a[i] = sc.nextLong();
			if(i%2 == 0)
			{
				curso += a[i];
			}
			else
			{
				cursx += a[i];
			}
			sumo[i] = curso;
			sumx[i] = cursx;
		}
		//start with o
		if(n==2)
		{
			System.out.println(Math.max(a[0], a[1]));
			return;
		}
		
		if(n%2!=0)
		{
			//state 0 means start with o
			long shiftxscore = 0;
			long shiftxindex = 0;
			
			long max = -999999999999999999l;
			for(int i = n-1; i >= 0; i--)
			{
				int state = i%2==0?0:1;
				long con = 0;
				
				if(state == 1)
				{
					shiftxscore += a[i]; //update if we shift from x at old best spot
				}
				
				if(state == 0)
				{ //currently o, shift to x here? (then probably shift back at best spot)
					long sofar = 0;
					if(i>0)sofar=sumo[i-1];
					
					//rest
					long noshiftback = cursx; //rest would be all of x, except before this
					if(i>0)noshiftback-=sumx[i-1];
					//if we shift back, then we would gain shiftxscore
					long consi = sofar + Math.max(noshiftback, shiftxscore);
					
//					System.out.println(i + " consider " + consi);
					max = Math.max(max, consi);
				}
				else
				{ //currently x. should we shift from x here instead?
					con=curso; //o from here on
					if(i>0)con-=sumo[i-1];
					if(con > shiftxscore)
					{
						shiftxscore = con;
						shiftxindex = i;
					}
//					System.out.println(i + " considerx " + con);
				}
//				System.out.println(i + ": " + shiftxscore);
			}
			System.out.println(max);
		}
		else
		{ //even case: shift once
			long max = -999999999999999999l;
			for(int i = 0; i < n; i++)
			{
				if(i%2==0)
				{
					long con = 0;
					if(i>0)con+=sumo[i-1];
					long contem = con;
					con+=cursx;
					if(i>0)con-=sumx[i-1];
					if(max<con)System.out.println(i + ": " + contem + " " + cursx);
					max = Math.max(max, con);
				}
			}
			
			long con = 0;
			for(int i  =0; i < n; i+=2)
			{
				con += a[i];
			}
			max = Math.max(max, con);
			con = 0;
			for(int i  =1; i < n; i+=2)
			{
				con += a[i];
			}
			max = Math.max(max, con);
			System.out.println(max);
		}
	}

}
