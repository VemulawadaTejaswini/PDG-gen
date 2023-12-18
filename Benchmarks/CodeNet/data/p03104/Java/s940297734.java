
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();


        System.out.println(xor(a-1) ^ xor(b));
    }

    static long xor(long a) {
        a = Math.max(a, 0);
        long res = 0;
        int d4 = (int) (a % 4);
        long[] d4a = {0, 1, 1, 0};
        int d8 = (int)  (a % 4);
        long[] d8a = {0, 0, 1, 0, 0, 0, 1, 0};
        long[] da = {1, 0, 1, 0};
        res += d4a[d4];
        res += d8a[d8] << 1;
        for(int i=2; i<50; i++) {
            if((a >> i) % 2 == 1) {
                res += da[d4] << i;
            }
        }
        return res;

    }

}
