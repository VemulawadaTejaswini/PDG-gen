import java.util.*;

public class Main {
	public static void main(String() args) {
    	Scanner sc = new Scanner(System.in);
      	int N = sc.nextInt();
     	int sum = 0;
      	int max = 0;
      	while (N > 0) {
        	int temp = sc.nextInt();
          	sum += temp;
          	max = Math.max(max, temp);
          	N--;
        }
      	if (sum - max > max) {
        	System.out.println("Yes");
        } else {
        	System.out.println("No");
        }
    }
}