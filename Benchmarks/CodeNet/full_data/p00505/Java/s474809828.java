import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		int cnt=0;
		int tyo=0;
		int don=0;
		int ei=0;
		for(;;)
		{
			int a=in.nextInt();
			int b=in.nextInt();
			int c=in.nextInt();
			if(!(Math.abs(a-b)<c)||!(c<a+b))
				break;
			int A=Math.min(a, b);
			int B=Math.max(a, b);
			int C=0;
			++cnt;
			if(B>c)
			{
				C=B;
				B=c;
			}
			else
				C=c;

			if(C*C>A*A+B*B)
				++don;
			else if(C*C<A*A+B*B)
				++ei;
			else
				++tyo;
		}
		System.out.println(cnt+" "+tyo+" "+ei+" "+don);
	}


	static public void debug(Object... o)
	{
		System.out.println(Arrays.deepToString(o));
	}
}