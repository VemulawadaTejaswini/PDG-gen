import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		int cnt = 0;
		int i;

		for(i = x; x < y; x++)
		{
			if(z % x == 0)
			{
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}