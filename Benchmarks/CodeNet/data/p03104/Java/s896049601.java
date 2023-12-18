import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long count = 0;
        long xor = 0;
        for(long num = a; num <= b; num++) {
            xor ^= num;
            count++;
        }
        if(count % 2 == 0 || count == 1) {
            System.out.println(xor);
        } else {
            long rev = 0;
            while (xor != 0) {
                rev <<= 1;
                rev |= (xor & 1);
                xor >>= 1;
            }
            System.out.println(rev);
        }
    }
}