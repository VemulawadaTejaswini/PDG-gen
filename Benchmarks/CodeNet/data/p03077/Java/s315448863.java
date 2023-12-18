import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        List<Long> list = new ArrayList<Long>();
        Scanner scan = new Scanner(System.in);
        long n = (long)scan.nextLong();

        for(int i = 0 ; i < 5; i++) {
            list.add(scan.nextLong());
        }
        long p = 0;
        long min = Collections.min(list);

        if (min > 0 && min <= n) {
            // System.out.println("b");
            if (min > n / 2) {
                p = n / min;
                if(n % min != 0) {
                    p += 1;
                }
                // System.out.println("a");
            }

            if (min < n / 2) {
                // System.out.println("d");
                if(n % min == 0) {
                    // System.out.println("p = " + p);
                    p += n / min;
                    // System.out.println("c");
                } else {
                    p += (n / min) + 1;
                }
            }
        }
        System.out.println(5 + p);
    }
}
