import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		for(;;)
		{
			double S1=0,S2=0;
			int angle1=0,angle2=0;
			int m1=in.nextInt();
			if(m1==0)
				return;
			for(int i=0;i<m1-1;i++)
			{
				double vi=in.nextInt();
				angle1+=vi;
				S1+=Math.sin(vi*Math.PI/180);
			}
			S1+=Math.sin((360-angle1)*Math.PI/180);
			int m2=in.nextInt();
			for(int i=0;i<m2-1;i++)
			{
				double vi=in.nextInt();
				angle2+=vi;
				S2+=Math.sin(vi*Math.PI/180);
			}
			S2+=Math.sin((360-angle2)*Math.PI/180);
			if(Math.abs(S1-S2)<1e-8)//1e-8=0.00000001
				System.out.println(0);
			else if(S1>S2)
				System.out.println(1);
			else if(S2>S1)
				System.out.println(2);
			
		}
	}
}