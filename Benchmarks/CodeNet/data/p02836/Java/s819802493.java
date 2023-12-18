import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str=in.next();
		int c=0;
		for(int i=0;i<=str.length()/2-1;i++)
		{
			if(str.charAt(i)!=str.charAt(str.length()-(i+1)))
			{
				c++;
			}
		}
		System.out.println(c);
	}
}