import java.util.Scanner;

public class Main{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		String a=sc.next();
		String b=sc.next();
		String c=sc.next();

		//各文字列の最初の文字と最後の文字を所得
		char a_final=a.charAt(a.length()-1);
		char b_ini=b.charAt(0);
		char b_final=b.charAt(b.length()-1);
		char c_ini=c.charAt(0);

		String ans;

		//しりとりになっているかの確認
		if (a_final==b_ini && b_final==c_ini) ans="YES";
		else ans="NO";
		
		System.out.println(ans);	
	}
	
} 