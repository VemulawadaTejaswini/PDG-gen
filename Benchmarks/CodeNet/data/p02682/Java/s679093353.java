import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    	int a = sc.nextInt();
    	int b = sc.nextInt();
    	int c = sc.nextInt();
    	int k = sc.nextInt();
    	int sum = 0;
    	if(a < k) {
    		k -= a;
    		sum = a;
    		if(b < k) {
    			k -= b;
    			sum -= k;
    		}
    	}else {
    		sum = k;
    	}
    	System.out.println(sum);
    }
}