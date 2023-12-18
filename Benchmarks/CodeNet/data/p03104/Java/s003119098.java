
import java.util.*;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();

        // f(0, A-1) xor f(0, B)と同じ
        long tmp1 = func(A-1);
        long tmp2 = func(B);

        out.println(tmp1^tmp2);
    }

    public static long func(long x) {

        // 偶数nと偶数n+1の排他的論理和は1
        // (0 xor 1) xor (2 xor 3) ... xor ... (2n xor 2n+1) xor 2n+2
        //  = 1 xor 1 xor ... xor ... 1 xor n+2

        int oneNum = (int) ((x + 1) / 2);

        if(oneNum % 2 == 0){
            if(x % 2 == 0) {
                return x;
            } else {
                return 0;
            }
        } else {
            if(x % 2 == 0) {
                return 1^x;
            } else {
                return 1;
            }
        }
    }

}
