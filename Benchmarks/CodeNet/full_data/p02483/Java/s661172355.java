import java.util.Scanner;
import java.util.Arrays;

class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int[] i = new int[] {a, b, c};
		Arrays.sort(i);
		
		System.out.println(i[2] + " " + i[1] + " " + i[0]);
	}
}