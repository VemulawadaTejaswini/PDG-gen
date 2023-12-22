import java.util.Scanner;
 
class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String str = sc.nextLine();
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		System.out.println(sb.toString() + "\n\r");
	}
}