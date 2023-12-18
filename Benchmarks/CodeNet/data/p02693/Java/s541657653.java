import java.util.*;

public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int num = (b - a) / k;
        if(num > 0) {
            System.out.println("OK");
        } else if(a % k == 0 || b % k == 0) {
            System.out.println("OK");    
        } else {
            System.out.println("NG");
        }
	}
}