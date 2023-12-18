import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long h = (long) Math.sqrt(n) + 1;
        long ans = n-1;
        for (int i =   1; i <= h; i++) {
            if(n % i == 0){
                long tmp = i-1 + (n/i)-1;
                if(tmp < ans) ans = tmp;
            }
        }
        System.out.println(ans);
        sc.close();

    }

}
