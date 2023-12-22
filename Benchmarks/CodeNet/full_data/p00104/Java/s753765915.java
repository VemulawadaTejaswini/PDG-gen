import java.util.Scanner;
public class Main
{
	public static void main(String arg[])
	{
		Scanner in=new Scanner(System.in);
		for(;;)
		{
			int H=in.nextInt();
			int W=in.nextInt();
			if((H|W)==0)
				return;
			int base[][]=new int[H][W];
			for(int i=0;i<H;i++)
			{
				String s=in.next();
				for(int j=0;j<W;j++)
				{
					if(s.charAt(j)=='.')
						base[i][j]=0;
					else if(s.charAt(j)=='^')
						base[i][j]=1;
					else if(s.charAt(j)=='>')
						base[i][j]=2;
					else if(s.charAt(j)=='v')
						base[i][j]=3;
					else if(s.charAt(j)=='<')
						base[i][j]=4;
				}
			}
			int nowh=0;
			int noww=0;
			for(;;)
			{
				if(base[nowh][noww]==1)
				{
					base[nowh][noww]=5;
					nowh--;
				}
				else if(base[nowh][noww]==2)
				{
					base[nowh][noww]=5;
					noww++;
				}
				else if(base[nowh][noww]==3)
				{
					base[nowh][noww]=5;
					nowh++;
				}
				else if(base[nowh][noww]==4)
				{
					base[nowh][noww]=5;
					noww--;
				}
				else if(base[nowh][noww]==0)
				{
					System.out.println(noww+" "+nowh);
					break;
				}
				else if(base[nowh][noww]==5)
				{
					System.out.println("LOOP");
					break;
				}
			}
		}
	}
}