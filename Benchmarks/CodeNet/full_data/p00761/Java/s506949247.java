import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
public class Main
{
	public static void main(String arg[])
	{
		Scanner in=new Scanner(System.in);
		for(;;)
		{
			int a=in.nextInt();
			int L=in.nextInt();
			if((a|L)==0)
				return;
			LinkedList<String> LL=new LinkedList<String>();
			boolean judge=false;
			int ai=-1,aj=-1;
			LL.add(a+"");
			for(;;)
			{
				for(int j=0;j<LL.size();j++)
					for(int i=j+1;i<LL.size();i++)
					{
						if(LL.get(i).equals(LL.get(j)))
						{
							judge=true;
							ai=i;
							aj=j;
						}
					}
				if(judge)
					break;
				String max="";
				String min="";
				char ch[]=(a+"").toCharArray();
				Arrays.sort(ch);

				for(int k=0;k<ch.length;k++)
					min+=ch[k];
				while(min.length()<L)
					min="0"+min;
				StringBuilder sb=new StringBuilder(min);
				max=sb.reverse().toString();
				a=Integer.valueOf(max)-Integer.valueOf(min);
				LL.add(a+"");
			}
			System.out.println(aj+" "+LL.get(ai)+" "+(ai-aj));
		}
	}
}