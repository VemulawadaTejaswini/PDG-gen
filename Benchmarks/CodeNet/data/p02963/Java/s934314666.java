import java.util.*;
import java.math.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long S = Long.parseLong(sc.next());

//        (x1−x3)(y2−y3) = S + (x2−x3)(y1−y3)
//        x1*y2 = S + x2*y1
//        3 = x2*y1 - x1*y2
//        1 3 0 0
//          S = x1*y2 - x2*y1

        long x1, y1, x2, y2, x3, y3 = 0l;
        long sqrt = longSqrt(S);
        long base = sqrt*sqrt-S;
        long sapo = 0l;
        if(base<0l){
          sapo = -base;
        }
        System.out.println(
          new StringBuilder().append(sqrt*sqrt-S+sapo).append(" ")
          .append(sqrt).append(" ")
          .append(sqrt+sapo).append(" ")
          .append(1).append(" ")
          .append(0+sapo).append(" ")
          .append(0).toString()
        );
//        System.out.println(calc(sqrt*sqrt-S+sapo, sqrt, sqrt+sapo, 1l, 0l+sapo, 0l));
    }
    public static long calc(long x1,long y1,long x2,long y2,long x3,long y3){
      System.out.println(
        new StringBuilder()
        .append(x1).append(" ")
        .append(y1).append(" ")
        .append(x2).append(" ")
        .append(y2).append(" ")
        .append(x3).append(" ")
        .append(y3).append(" ").toString()
      );
      return Math.abs((x1-x3)*(y2-y3)-(x2-x3)*(y1-y3));
    }

    private static long longSqrt (long a) {
        long b = (long)Math.sqrt(a);
        // 得られた値を2乗して元の値を超える場合は
        // 誤差で1大きくなっているため
        // 誤差修正のため1引いた値を返す
        if(b*b > a) {
//            b--;
        }
        return b;
    }
}
