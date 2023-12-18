import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
        Scanner stdin = new Scanner(System.in);

        int A = stdin.nextInt();
        int B = stdin.nextInt();
        
        if(10 > A && 10 > B) {
        	System.out.println(A*B);
        }
        else {
        	System.out.println("-1");
        }

	}
}
