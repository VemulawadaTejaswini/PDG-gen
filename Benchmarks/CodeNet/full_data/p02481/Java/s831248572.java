import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int men = 0;
		int syu = 0;
		men = x * y;
		syu = (x + y) * 2;
		System.out.println(men);
		System.out.println(syu);
	}
}