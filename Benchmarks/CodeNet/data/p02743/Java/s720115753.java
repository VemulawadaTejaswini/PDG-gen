
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
    	long a = sc.nextLong();
    	long b = sc.nextLong();
    	long c = sc.nextLong();


    	if( c - a - b >= 0) {
    		if((c - a - b)*(c - a - b) > 4 * a * b){
    			System.out.println("Yes");
    		}else {
    			System.out.println("No");
    		}
    	}else {
    		System.out.println("No");
    	}
    }
}