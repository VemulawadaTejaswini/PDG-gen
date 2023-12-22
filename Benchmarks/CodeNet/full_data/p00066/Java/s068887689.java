import java.util.Scanner;
public class Main
{
	public static void main(String arg[])
	{
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			char ch[] =in.next().toCharArray();
			if((ch[0]=='o'&&ch[1]=='o'&&ch[2]=='o')||(ch[3]=='o'&&ch[4]=='o'&&ch[5]=='o')||(ch[6]=='o'&&ch[7]=='o'&&ch[8]=='o')
					||(ch[0]=='o'&&ch[3]=='o'&&ch[6]=='o')||(ch[1]=='o'&&ch[4]=='o'&&ch[7]=='o')||(ch[2]=='o'&&ch[5]=='o'&&ch[8]=='o')
					||(ch[0]=='o'&&ch[4]=='o'&&ch[8]=='o')||(ch[2]=='o'&&ch[4]=='o'&&ch[6]=='o'))
				System.out.println("o");
			else
				if((ch[0]=='x'&&ch[1]=='x'&&ch[2]=='x')||(ch[3]=='x'&&ch[4]=='x'&&ch[5]=='x')||(ch[6]=='x'&&ch[7]=='x'&&ch[8]=='x')
						||(ch[0]=='x'&&ch[3]=='x'&&ch[6]=='x')||(ch[1]=='x'&&ch[4]=='x'&&ch[7]=='x')||(ch[2]=='x'&&ch[5]=='x'&&ch[8]=='x')
						||(ch[0]=='x'&&ch[4]=='x'&&ch[8]=='x')||(ch[2]=='x'&&ch[4]=='x'&&ch[6]=='x'))
					System.out.println("x");
				else
					System.out.println("d");
		}
	}
}