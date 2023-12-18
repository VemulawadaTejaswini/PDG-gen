import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		int min = Integer.MAX_VALUE;
		int max = 0;
		int count = 0;
		for (int i = 0; i < n; i++) {
		    int x = sc.nextInt();
		    if (min > x) {
		        min = x;
		    } else {
		        int sub = x - min;
		        if (max < sub) {
		            max = sub;
		            count = 1;
		        } else if (max == sub) {
		            count++;
		        }
		    }
		}
		System.out.println(count);
   }
}


