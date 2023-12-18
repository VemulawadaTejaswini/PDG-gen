import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// get a integer
		int a = sc.nextInt();
		// get two integers separated with half-width break
		Set<Integer> used = new HashSet<>();
      	for (int i = 1; ; i++) {
          	if (i == 1) {
            	used.add(a);
            } else {
            	int val = helper(i - 1);
              	if (used.contains(val)) {
                	return val;
                }
            }
        	return -1;
        }
	}
  
    private int helper(int n) {
    	if (n % 2 == 0) {
        	return n / 2;
        } else {
        	return 3 * n + 1;
        }
    }
}