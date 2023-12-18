import java.math.BigDecimal;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {
        //入力
    	Scanner sc = new Scanner(System.in);
    	double a = Math.sqrt(sc.nextDouble());
    	double b = Math.sqrt(sc.nextDouble());
    	double c = Math.sqrt(sc.nextDouble());



    	if( a + b < c) {
    		System.out.println("Yes");
    	} else {
    		System.out.println("No");
    	}
    }
}