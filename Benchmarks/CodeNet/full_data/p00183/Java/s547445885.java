import java.util.Scanner;
public class Main
{
	public static void main(String arg[])
	{
		Scanner in= new Scanner(System.in);
		while(in.hasNext())
		{
			char[] c1=in.next().toCharArray();
			if(c1[0]=='0')
				return;
			char[] c2=in.next().toCharArray();
			char[] c3=in.next().toCharArray();

			if(c1[0]=='b'&&c1[1]=='b'&&c1[2]=='b'||c2[0]=='b'&&c2[1]=='b'&&c2[2]=='b'||c3[0]=='b'&&c3[1]=='b'&&c3[2]=='b'
					||c1[0]=='b'&&c2[0]=='b'&&c3[0]=='b'||c1[1]=='b'&&c2[1]=='b'&&c3[1]=='b'||c1[2]=='b'&&c2[2]=='b'&&c3[2]=='b'
					||c1[0]=='b'&&c2[1]=='b'&&c3[2]=='b'||c1[2]=='b'&&c2[1]=='b'&&c3[0]=='b')
				System.out.println("b");
			else if(c1[0]=='w'&&c1[1]=='w'&&c1[2]=='w'||c2[0]=='w'&&c2[1]=='w'&&c2[2]=='w'||c3[0]=='w'&&c3[1]=='w'&&c3[2]=='w'
					||c1[0]=='w'&&c2[0]=='w'&&c3[0]=='w'||c1[1]=='w'&&c2[1]=='w'&&c3[1]=='w'||c1[2]=='w'&&c2[2]=='w'&&c3[2]=='w'
					||c1[0]=='w'&&c2[1]=='w'&&c3[2]=='w'||c1[2]=='w'&&c2[1]=='w'&&c3[0]=='w')
				System.out.println("w");
			else System.out.println("NA");
		}
	}
}