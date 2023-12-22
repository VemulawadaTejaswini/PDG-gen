import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int a = in.nextInt();
            int b = in.nextInt();
            for(int i = Math.max(a, b); 0 <= i; i--) {
            	if(a % i == 0 && b % i == 0) {
            		System.out.println(i);
            		break;
            	}
            }
            
	}
}
