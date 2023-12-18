import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(),a=sc.nextInt(),b=sc.nextInt();

		if(a==b && b==n) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}
	public static int floor(int n) {
		return (int)Math.floor((n*n + 4.0)/8.0);
	}

}
