import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int W = sc.nextInt();
		int H = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		double area = H*W/2;
		System.out.printf("%.8f",area);
		
		if (x==0 && y==0)
			System.out.println(" "+0);
		
		else if (x==W/2 && y==H/2)
			System.out.println(" "+1);
		else
			System.out.println(" "+0);
	}

}
