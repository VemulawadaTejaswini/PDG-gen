import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int k = sc.nextInt();
		int sum = 0;
		
		if (k - a >= 0) {
		    k -= a;
		    sum += a;
		    if (k - b >= 0) {
		        k -= b;
		        if (k - c >= 0) {
		            sum -= c;
		        } else {
		            sum -= k;
		        }
		    }
		} else {
		    sum = k;
		}
		System.out.println(sum);
	}
}