import java.util.*;
public class Main {
	public static void main(String[] args)
	{
		//変数
		long count=0;
		boolean sw=false;
		String sb="";
		String sa="";
		
		//入力
		Scanner sc = new Scanner(System.in);
		String S=sc.next();
		
		//処理
		sb=S;
		while(sw==false)
		{
			sa=sb.replaceFirst("BW","WB");
			if(sa.equals(sb))
			{
				sw=true;
			}else
			{
				sb=sa;
				count++;
			}
		}
		// 出力
		System.out.println(count);
	}
}