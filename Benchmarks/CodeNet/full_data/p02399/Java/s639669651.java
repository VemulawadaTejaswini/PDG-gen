import java.util.Scanner;
class Main {
    private static Scanner sc;

	public static void main(String[] args) {
        sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int d = a / b;
        int r = a % b;
        double f = (double)a / b;
        System.out.println(String.format("%d %d %.5f", d, r, f));
    }
}