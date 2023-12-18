import java.util.*;
public class Main {
	public static void main(String[] args){
      	Scanner sc = new Scanner(System.in);
      	int a1 = sc.nextInt();
        int prev = 0;
        Map<Integer, Integer> map = new HashMap<>();
      	for (int i = 1; ; i++) {
          	if (i == 1) {
            	used.add(a1);
              	prev = a1;
            } else {
            	int val = helper(prev);
              	prev = val;
              	if (map.containsKey(val)) {
                	System.out.println(i);
                  	break;
                }
            }
        }
	}
  
    private static int helper(int n) {
    	if (n % 2 == 0) {
        	return n / 2;
        } else {
        	return 3 * n + 1;
        }
    }
}