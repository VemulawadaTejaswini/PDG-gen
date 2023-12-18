import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String ans = "";
		int num = sc.nextInt();
		String str = sc.next();
		String S[] = str.split("");
		String str2 = sc.next();
		String T[] = str2.split("");
		for(int i=0;i<num;i++)
		{
			ans = ans + S[i] + T[i];
		}
		System.out.println(ans);		
	}
}