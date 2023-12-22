import java.util.Scanner;

/*

*/

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long v = sc.nextLong();

        long b = sc.nextLong();
        long w = sc.nextLong();

        long t = sc.nextLong();

        // 一秒ごとに近づく距離
        long sec_kyori = Math.abs(w - v);
        long act_kyori = Math.abs(a - b);

        boolean flg = false;
        for (int i = 0; i < t; i++) {
            long temp_a = b > a ? a + sec_kyori : a - sec_kyori;
            long temp_b = b > a ? b + sec_kyori : b - sec_kyori;
            if (temp_a == temp_b) {
                System.out.println("YES");
                return;
            }
            a =temp_a;
            b = temp_b;
        }
        if (!flg) {
            System.out.println("NO");
        }
    }
}