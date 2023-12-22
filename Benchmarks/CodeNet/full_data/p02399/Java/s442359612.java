import java.util.Scanner;

class Main {
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		try {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (1 <= a && a <= 1000000000){
			if (1 <= b && b <= 1000000000){
				System.out.printf("%d %d %.5f", a/b, a%b, (double)a/b);
			}
			}
		}
		finally {
		sc.close();
		}
	}
}
