import java.math.BigDecimal;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {
        //入力
    	@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
    	int a = sc.nextInt();
    	int b = sc.nextInt();
    	int c = sc.nextInt();

    	if( (a + b - c)*(a + b - c) < 4 * a * b) {
    		System.out.println("Yes");
    	} else {
    		System.out.println("No");
    	}
    }
}