import java.util.Scanner;
public class Main
{
	public static void main(String arg[])
	{
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			char a[]=in.next().toCharArray();
			if(a[0]=='#')
				return;
			int c=0;
			boolean s=false;
			boolean t=false;
			for(int i=0;i<a.length;i++)
			{
				if(a[i]=='q'||a[i]=='w'||a[i]=='e'||a[i]=='r'||a[i]=='t'||
						a[i]=='a'||a[i]=='s'||a[i]=='d'||a[i]=='f'||a[i]=='g'||
						a[i]=='z'||a[i]=='x'||a[i]=='c'||a[i]=='v'||a[i]=='b')
				{
					t=true;
					if(s&&t)
						c++;
					s=false;
				}
				else if(a[i]=='y'||a[i]=='u'||a[i]=='i'||a[i]=='o'||a[i]=='p'||
						a[i]=='h'||a[i]=='j'||a[i]=='k'||a[i]=='l'||
						a[i]=='n'||a[i]=='m')
				{
					s=true;
					if(s&&t)
						c++;
					t=false;
				}
			}
			System.out.println(c);
		}
	}
}