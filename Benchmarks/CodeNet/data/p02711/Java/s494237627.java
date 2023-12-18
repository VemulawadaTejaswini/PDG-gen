import java.util.*;

public class Main {

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {
        //入力
    	Scanner sc = new Scanner(System.in);
    	String str = sc.next();
    	for(int i = 0 ; i < 3; i++) {
    		if(str.substring(i,i+1).equals("7")) {
    			System.out.println("Yes");
    			System.exit(0);
    		}
    	}
    	System.out.println("No");
    }
}