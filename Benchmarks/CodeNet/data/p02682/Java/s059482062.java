import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c, k;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		k = sc.nextInt();
		int sum = 0;
        if (a < k) {
            k -= a;
            sum += a;
            if (b < k) {
                k -= b;
                if (c < k) {
                    System.out.println(sum-c);
                } else if (c == k) {
                    System.out.println(sum-k);
                } else {
                    System.out.println(sum-k);
                }
            }
            else if (b == k) {
                System.out.println(sum);
            } else {
                System.out.println(sum - k);
            }
            
        } else if (a == k) {
            System.out.println("" + (a));
        } else {
            System.out.println("" + k);
        }
		
	}
}