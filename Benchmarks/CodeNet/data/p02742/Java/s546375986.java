import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        new Main().run();
    }
 
    void run() {
        //入力
    	Scanner sc = new Scanner(System.in);
    	int h = sc.nextInt();
    	int w = sc.nextInt();
    	if(h != 1 && w != 1) {
    		if(h % 2 == 1 && w % 2 == 1) {
    			System.out.println((h * w +1)/2);
    		} else {
    			System.out.println(h * w / 2);
    		}
    	}else {
    		System.out.println("1");
    	}
    }
}