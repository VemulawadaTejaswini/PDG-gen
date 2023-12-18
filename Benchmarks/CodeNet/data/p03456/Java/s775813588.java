import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		int a,b;
		Scanner sc = new Scanner(System.in);
		
		a=sc.nextInt();
		b=sc.nextInt();
		
		String s = ""+a+b;
		int i = Integer.parseInt(s);//parse:分析する string⇨intにする
		//System.out.println(i);
		if( Math.floor(Math.sqrt(i)) * Math.floor(Math.sqrt(i)) ==i ) 
		{
			System.out.println("Yes");
		}
		else
			System.out.println("No");
	}
}
