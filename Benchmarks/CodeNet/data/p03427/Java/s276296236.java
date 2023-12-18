import java.util.*;

public class Main{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		long N=sc.nextLong();

		String s=String.valueOf(N+1);	//読み込んだ文字列をlong型からString型に変更
		int len=s.length();	//文字列の長さをlenに格納
		int c=Integer.parseInt(s.substring(0, 1));	//文字列の頭文字をcに格納

		int ans=(c-1)+9*(len-1);	//N+1を考えることでansは常にこの式になる
		System.out.println(ans);

	}
}