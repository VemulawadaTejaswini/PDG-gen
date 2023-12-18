import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		long cura = 0;
		long curb = 0;
		for(int i = 0; i < n; i++)
		{
			long a = sc.nextLong();
			long b = sc.nextLong();
			
			long mul = 1;
			if(i>0)
			{
				if(a<cura)
				{
					long curmul = cura/a;
					if(cura%a!=0)curmul++;
					mul = Math.max(mul, curmul);
				}
				if(b<curb)
				{
					long curmul = curb/b;
					if(curb%b!=0)curmul++;
					mul = Math.max(mul, curmul);
				}
				
			}
			cura=a*mul;
			curb=b*mul;
			
		}
		System.out.println(cura+curb);

	}

}
