import java.util.*;
public class Main
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int d, n;
		n = input.nextInt();
		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0)
				System.out.print(" " + i);
			else {
				d = i;
				while(d > 0) {
					if (d % 10 == 3) {
						System.out.print(" " + i);
						break;
					}
					else d /= 10;
				}
			}
		}
		System.out.println();
	}
}