import java.util.Scanner;

/**
 * Created by wild on 16/08/28.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long num = scan.nextLong();
        long ans = scan.nextLong();


        boolean ok = false;
        if (ans == num) {
            ok = true;
            System.out.println(num+1);
        }else if (ans == 1){
            ok= true;
            System.out.println(num);
        }else if (num == 1){

        } else {
            for (long i = 2; i <= ans; i++) {
                long res = tasu(num, i);
                if (res == ans) {
                    ok = true;
                    System.out.println(i);
                    break;
                }
            }
        }

        if (!ok){
            System.out.println(-1);
        }


    }

    public static long tasu(long num, long n) {
        long result = 0;
        long tmpAns = num;

        while (tmpAns != 0) {
            result += tmpAns % n;
            tmpAns /= n;
        }

        return result;
    }
}