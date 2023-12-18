import java.util.Scanner;
public class Main {
	
	static int getfirst(int nu)
	{
		int fir=0;
		while(nu>0)
		{
			fir=nu%10;
			nu=nu/10;
		}
		return fir;
	}
	
		public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int val,count=0,a,b;
		val=sc.nextInt();
		
		if(val<=9)
		{
			count=val;
		}
		else
		{
			int af,al,bf,bl;
			for(a=1;a<=val;a++)
			{
				for(b=0;b<=val;b++)
				{
					af=getfirst(a);
					al=a%10;
					bf=getfirst(b);
					bl=b%10;
					if(af==bl && al==bf)
					{
						count++;
					}
				}	
				b=0;
			}
		}
		System.out.println(count);
	}
}
