
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        int lenB = 0;
        long copyB = b;
        while (copyB > 0) {
            lenB++;
            copyB /= 2;
        }
        int [] resB = new int[lenB];
        int [] resA = new int[lenB];
        check(a - 1, resA, lenB);
        check(b, resB, lenB);
        int [] res = new int[lenB];
        for (int i = 0; i < lenB; ++i) {
            res[i] = (resA[i] == resB[i]) ? 0 : 1;
        }
        long answer = 0;
        for (int i = 0; i < lenB; ++i) {
          // System.out.println("res[" + i + "]: " + res[i]);
            answer += Math.pow(2, i) * res[i];
        }
        System.out.println(answer);

    }

    // 0 ... xor value
    public static void check(long value, int[] res, int lenB) {
        long num = value + 1L;
        for (int i = 0; i < lenB; ++i) {
            long len = (long) Math.pow(2, i);
            long t1 = num / len;
            long mod = num % len;
            long zeroPack =
                    (t1 % 2 == 0) ? t1 / 2 : (t1 / 2 + 1);
            long onePack = t1 / 2;
            long oneNum = onePack * len;
            if (t1 % 2 == 1) {
                oneNum += mod;
            }
         //   System.out.println("t1: "+ t1);
            if (oneNum % 2 == 1) {
                res[i] = 1;
            } else {
                res[i] = 0;
            }
         //   System.out.println("bit: " + i + " oneNum: " + oneNum);
        }
//        System.out.println("value: " + value);
//        for (int i = lenB - 1; i >= 0; --i) {
//            System.out.print(res[i]);
//        }
//        System.out.println();

    }
    }
