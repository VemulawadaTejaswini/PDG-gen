import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int[][] table = new int[ h][w];
		int count = ((w+2-1)/2)*((h+2-1)/2)+((w/2)*(h/2));
		System.out.print(count);

	}

}