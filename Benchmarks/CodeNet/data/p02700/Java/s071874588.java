import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(),b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
		int x = a/d, y = c/b;
		if(a%d != 0) {
			x++;
		}
		if(c%b != 0) {
			y++;
		}
		if(x >= y) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
