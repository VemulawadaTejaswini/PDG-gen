import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int D = sc.nextInt();
		int N = sc.nextInt();
		long Num = N*(long)Math.pow(100, D);
		System.out.println(Num);
	}
}