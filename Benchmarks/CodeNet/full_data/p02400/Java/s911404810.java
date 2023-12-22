import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        double r = sc.nextInt();
        double x = Math.PI;
        System.out.printf("%06f",r *2 * x);
        System.out.print(" ");
        System.out.printf("%06f", (double)r * r * x);
	}
}
