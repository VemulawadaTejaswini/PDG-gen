import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        float x = sc.nextInt();
        float y = sc.nextInt();
        System.out.print((int)(Math.floor(x / y)));
        System.out.print(" "+ (int)(x % y));
        System.out.println(" "+ x / y);
	}
}