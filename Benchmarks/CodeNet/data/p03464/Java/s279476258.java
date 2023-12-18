import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] array = new long[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextLong();
        }
        
        //       3
        //       3
        //  3 4 3 2
        // 6 4 3 2 2
        // 117 5 3 2
        long min = 2;
        long max = 2;
        String ans = "";
        for (int i = n-1; i >= 0; i--) {
            long num = array[i];
            long nmin = (min + num-1) / num * num;
            long nmax = max / num * num;
            
            if (min <= nmin && nmin <= nmax && nmax <= max) {
                min = nmin;
                max = nmax;
                max += (array[i]-1);
            } else {
                ans = "-1";
                break;
            }
            
            // System.out.println(num + " " + min + " " + max);
        }
        
        if (!ans.equals("-1")) {
            ans = min + " " + max;
        }
        System.out.println(ans);
    }
}
