import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		while(i <= n) {
			int x = i;
			if(x % 3 == 0)	System.out.printf(" %d", i);
			else if(x % 10 == 3)	System.out.printf(" %d", i);
			else	x /= 10;
			i++;
		}
			System.out.printf("\n");
	}
}

