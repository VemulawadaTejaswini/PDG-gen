import java.util.*;
public class Main {
	public static void main(String[] args)
	{
		//変数
		long count=0;
		boolean sw=false;
		String sb="";
		String sa="";
		String c="";
		
		//入力
		Scanner sc = new Scanner(System.in);
		String S=sc.next();
		
		//処理
		sb=S;
		while(sw==false)
		{
			c=sb.replace("BW","");
			sa=sb.replace("BW","WB");
			//System.out.println(sa);
			//System.out.println(c);
			//System.out.println("--------");
			if(sa.equals(sb))
			{
				sw=true;
			}else
			{
				sb=sa;
				count=count+(sa.length()-c.length())/2;
				//System.out.println(sb);
				//System.out.println(count);
			}
		}
		// 出力
		System.out.println(count);
	}
}