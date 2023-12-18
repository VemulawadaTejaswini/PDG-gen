import java.util.*;
 
public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int[] Hi = new int[N];
    	int tmp = sc.nextInt();
    	int line = 0;
    	boolean flg = true;
    	for (int i = 1; i < N; i++) {
    		int h = sc.nextInt();
    		if (h + 1 < tmp) {
    			flg = false;
    		} else if (h + 1 == tmp) {
    			if (h < line) {
    				flg = false;
    			}
    			line = h;
    		}
    		tmp = h;
    	}
    	System.out.println(flg ? "Yes" : "No");
    }
}