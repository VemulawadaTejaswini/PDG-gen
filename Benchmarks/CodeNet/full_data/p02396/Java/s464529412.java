import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int value[] = new int[100];
		value[0] = scan.nextInt();
		int ctr;
		
		for (ctr = 1; value[ctr-1] != 0 || ctr < 100; ctr++)
			value[ctr] = scan.nextInt();
		
		for (int i = 1; i < ctr-1; i++)
			System.out.printf("Case %d: %d\n", i, value[i]);
	}
}