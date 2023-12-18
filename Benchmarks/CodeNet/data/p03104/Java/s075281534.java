import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long[] counter = new long[64];
        for(long i = a; i <= b; i++) {
            long num = i;
            int index = 0;
            while(num != 0) {
                counter[index] += (num & 1);
                num >>>= 1;
                index++;
            }
        }
        String str = "";
        for(int i = 63; i >= 0; i--) {
            str += counter[i] % 2 == 0 ? "0" : "1";
        }
        System.out.println(Long.parseLong(str, 2));
    }
}