import java.util.*;

public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int num = b - a + 1;
        if(num >= k) System.out.println("OK");
        else System.out.println("NG");
        
	}
}