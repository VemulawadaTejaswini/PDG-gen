import java.util.*;
 
public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
        int coin500 = n / 500;
        int hapiness500 = coin500 * 1000;
        int coin5 = (n % 500) / 5;
        int hapiness5 = coin5 * 5;
        System.out.println(hapiness500 + hapiness5);
    }
}