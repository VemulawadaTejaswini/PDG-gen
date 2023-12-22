import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		String str;
		Scanner scan=new Scanner(System.in);
		str=scan.next();
		scan.close();
		for(int i=str.length()-1;0<=i;i--){
			System.out.print(str.charAt(i));
		}
		System.out.println();
	}
}