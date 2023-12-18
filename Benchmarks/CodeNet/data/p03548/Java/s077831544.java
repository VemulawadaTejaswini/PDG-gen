import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		int z = scan.nextInt();
		int n = 0;
		do{
			n++;
		}while(x > (n*y + n*z + z));
		System.out.println(n - 1);
		scan.close();
	}
}
