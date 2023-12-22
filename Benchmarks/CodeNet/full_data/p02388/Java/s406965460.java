import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		
		int ans = (int)Math.pow(x, 3);
		System.out.println(ans);
		
		sc.close();
	}

}

