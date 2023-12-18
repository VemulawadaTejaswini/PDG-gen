import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		double a = Math.sqrt(X);
		int max=1;
		for(int b =2;b<=X;b++) {
			for(int q =2;Math.pow(b,q)<=X;q++) {
				max=(int)Math.pow(b, q);
			}
		}
		System.out.println(max);
		sc.close();
	}
}
