import java.util.*;
public class Main {
	public static void main(String[] args)
	{
		//変数
		short index=0;
		long count=0;
		ArrayList<String> Sanswer=new ArrayList<String>();
		boolean sw=false;
		
		//入力
		Scanner sc = new Scanner(System.in);
		String S=sc.next();
		
		//処理
		for(int i=0;i<S.length();i++)
		{
			Sanswer.add(S.substring(i,i+1));
		}
		while(sw==false)
		{
			if(Sanswer.get(index).equals("B") && Sanswer.get(index+1).equals("W"))
			{
				Sanswer.set(index,"W");
				Sanswer.set(index+1,"B");
				count++;
				index=0;
			}else
			{
				index++;
			}
			if(index==S.length()-1)
			{
				sw=true;
			}
		}
		// 出力
		System.out.println(count);
	}
}