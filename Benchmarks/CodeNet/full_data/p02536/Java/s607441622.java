import java.util.HashMap;
import java.util.Scanner;


public class Main {


	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int m = sc.nextInt();

	    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

	    int wk = 0;

	    for (int i = 0; i < m; i++) {
	    	int a = sc.nextInt();
	    	int b = sc.nextInt();
	    	if (!map.containsKey(a)) {
	    		map.put(a, 1);
	    	} else {
	    		map.put(a, map.get(a) + 1);
	    	}
	    	if (!map.containsKey(b)) {
	    		map.put(b, 1);
	    	} else {
	    		map.put(b, map.get(b) + 1);
	    	}
	    }
	    for (int i = 1; i <= n; i ++) {
	    	if (!map.containsKey(i)) {
	    		wk++;
	    	}
	    }
	    System.out.println(wk);
	}
}