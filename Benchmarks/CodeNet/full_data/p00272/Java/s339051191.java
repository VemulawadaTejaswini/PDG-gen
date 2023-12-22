import java.util.Scanner;

public class Main {
	public static final int[] PRICE = {6000,4000,3000,2000};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<4;i++) {
			int t = sc.nextInt();
			int n = sc.nextInt();
			System.out.println(PRICE[t-1] * n);
		}
	}

}