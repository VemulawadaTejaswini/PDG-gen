import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        
        long[] twosix = new long[6];
        twosix[0] = 1;
        twosix[1] = twosix[0] * 26;
        twosix[2] = twosix[1] * 26;
        twosix[3] = twosix[2] * 26;
        twosix[4] = twosix[3] * 26;
        twosix[5] = twosix[4] * 26;
        String str = "";
        // for (long t : twosix) {
        //     System.out.println(t);
        // }
        for (int i = 5; i >= 0; i--) {
            long tmp = n / twosix[i];
            tmp--;
            if (tmp < 0) continue;
            // System.out.println(tmp);
            char c = (char)(tmp + 'a');
            str += c;
            // System.out.println(str);
            tmp++;
            n -= tmp * twosix[i];
        }
        System.out.println(str);
    }
}
