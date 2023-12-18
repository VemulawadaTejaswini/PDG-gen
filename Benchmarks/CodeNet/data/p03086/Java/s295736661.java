import java.util.*;
public class Main {
	public static void main(String[] args)
	{
		//変数
		int count=0;
		boolean sw=false;
		int answer=0;
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		String S="";
		
		int slength=0;
		String s="";
		//入力
		Scanner sc = new Scanner(System.in);
		S=sc.next();
		
		//処理
		slength=S.length();
		
		for(int i=0;i<slength;i++)
		{
			s=S.substring(i,i+1);
			if(s.equals("A") || s.equals("C") || s.equals("G") || s.equals("T"))
			{
				count++;
				if(count>max)
				{
					max=count;
				}
			}else
			{
				if(count>max)
				{
					max=count;
				}
				count=0;
			}
		}
		answer=max;
				
		// 出力
		System.out.println(answer);
	}
}