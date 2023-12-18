import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        
        if(n > k){
            n = n % k;
        }
        n = Math.min(n, k-n);

        System.out.println(n);
    }
}
