import java.util.Scanner;
public class Main{
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String ans="";
		for(int i=1;i<=str.length();i++)
			ans+=str.charAt(str.length()-i);
		System.out.println(ans);
		
	}
}