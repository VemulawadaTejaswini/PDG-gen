import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        
        int count = 0;
        long ts = 1;
        long tssum = 0;
        for (int i = 2; i < 100; i++) {
            if (n <= tssum) {
                break;
            } else {
                ts *= 26;
                tssum += ts;
                count++;
            }
        }
        
        // System.out.println(count);
        
        long tmp2 = 1;
        long tmpsum = 0;
        for (int i = 0; i < count-1; i++) {
            tmp2 *=26;
            tmpsum += tmp2;
        }
        n -= tmpsum;
        n--;
        
        // System.out.println(n);
        
        long twosix = 1;
        for (int i = 0; i < count-1; i++) {
            twosix *= 26;
        }
        
        String str = "";
        for (int i = 0; i < count; i++) {
            long tmp3 = n / twosix;
            // System.out.println(tmp3);
            char c = (char)(tmp3 + 'a');
            str += c;
            // System.out.println(c);
            
            n -= twosix * tmp3;
            twosix /= 26;
            // System.out.println(n);
        }
        
        System.out.println(str);
    }
}
