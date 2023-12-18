import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = 5;
        long m = sc.nextLong();
        long min = 100000000000000000L;
        for (int i = 0; i < n; i++) {
            min = Math.min(min, sc.nextLong());
        }
        
        long tmp = m / min;
        if (m % min != 0) {
            tmp++;
        }
        
        System.out.println(4 + tmp);
    }
}
