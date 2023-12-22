import java.util.Scanner;
public class Main
{
	public static void main(String arg[])
	{
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			int ans=0;
			int b=in.nextInt();
			int r=in.nextInt();
			int g=in.nextInt();
			int c=in.nextInt();
			int s=in.nextInt();
			int total=in.nextInt();
			if((b|r|g|c|s|total)==0)
				return;
			int my=100;
			my+=b*15+r*15+b*65+r*39+g*4+c*(-1);
			total=total-s-b*5-r*3-g-c;
			ans=my-total*3;
			System.out.println(ans);
		}
	}
}