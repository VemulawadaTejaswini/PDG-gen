import java.util.Arrays;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		for(;;)
		{
			String st=in.next();
			int cnt=0;
			boolean judge=false;
			if(st.equals("0000"))
				return;
			for(int i=0;i<4;i++)
			{
				if(st.charAt(0)==st.charAt(i))
					judge=true;
				else
				{
					judge=false;
					break;
				}
			}
			if(judge)
			{
				System.out.println("NA");
				continue;
			}
			for(;;)
			{
				if(st.equals("6174"))
					break;
				String max="";
				String min="";
				++cnt;
				char ch[]=(st+"").toCharArray();
				Arrays.sort(ch);
				
				for(int k=0;k<ch.length;k++)
					min+=ch[k];
				while(min.length()<4)
					min="0"+min;
				
				StringBuilder sb=new StringBuilder(min);
				max=sb.reverse().toString();
				st=(Integer.valueOf(max)-Integer.valueOf(min))+"";
			}
			System.out.println(cnt);
		}
	}
}