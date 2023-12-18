import java.util.Scanner;

public class G036C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long x1 = 0;
        long y1 = 0;
        long s = in.nextLong();
        in.close();
        /*
         * |x1y2 - x2y1| = 2S(公式利用)
         */
        long dom = (long) Math.sqrt(s); // 入力の平方根の小数点切りsage
        long dom2 = dom * dom;// 平方化
        if (dom2 < s) {
            dom++;
            dom2 = dom * dom;

        }
        long y3 = 1;
        long x2 = dom2 - s;
        System.out.println(x1 + " " + y1 + " " + x2 + " " + dom + " " + dom + " " + y3);


    }
}
