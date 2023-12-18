import java.util.*;

public class Main {

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {
        //入力
    	@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
    	long a = (long) Math.sqrt(sc.nextLong());
    	long b = (long) Math.sqrt(sc.nextLong());
    	long c = (long) Math.sqrt(sc.nextLong());



    	if( a + b < c) {
    		System.out.println("Yes");
    	} else {
    		System.out.println("No");
    	}
    }
}