import java.util.Scanner;

public class Main{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		String s=sc.next(); //入力された文字列
		
		//YAKIが最初に出現するインデックスが0かどうか確認
		if(s.indexOf("YAKI")==0) System.out.println("Yes");
		else System.out.println("No");
	}
} 