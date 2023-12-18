import java.util.*;
import java.math.*;


public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      long S = Long.parseLong(sc.next());
      long ans = solve(S);
//      return ans;
    }

    public static long solve(long S) {

//        (x1−x3)(y2−y3) = S + (x2−x3)(y1−y3)
//        x1*y2 = S + x2*y1
//        3 = x2*y1 - x1*y2
//        1 3 0 0
//          S = x1*y2 - x2*y1

        long x1, y1, x2, y2, x3, y3 = 0l;
        long sqrt = (long) Math.ceil(Math.sqrt(S));
        long base = sqrt*sqrt-S;
        long sapo = 0l;
        if(base<0l){
          sapo = 0;
        }
        System.out.println(
          new StringBuilder().append(base+sapo).append(" ")
          .append(sqrt).append(" ")
          .append(sqrt+sapo).append(" ")
          .append(1).append(" ")
          .append(0+sapo).append(" ")
          .append(0).toString()
        );
        return 0l;
//        return calc(sqrt*sqrt-S+sapo, sqrt, sqrt+sapo, 1l, 0l+sapo, 0l);
//        System.out.println(calc(sqrt*sqrt-S+sapo, sqrt, sqrt+sapo, 1l, 0l+sapo, 0l));
    }
    public static long calc(long x1,long y1,long x2,long y2,long x3,long y3){
      if(x1 < 0l || y1 < 0l || x2 < 0l || y2 < 0l || x3 < 0l || y3 < 0l
      || x1 > 1000000000l || y1  > 1000000000l || x2  > 1000000000l || y2  > 1000000000l || x3  > 1000000000l || y3  > 1000000000l
      ){
        System.out.println(
          new StringBuilder().append(x1).append(" ").append(y1).append(" ").append(x2).append(" ")
          .append(y2).append(" ").append(x3).append(" ").append(y3).append(" ")
          .append(" ans;").append(Math.abs((x1-x3)*(y2-y3)-(x2-x3)*(y1-y3))).toString()
        );
        throw new Error();
      }
      return Math.abs((x1-x3)*(y2-y3)-(x2-x3)*(y1-y3));
    }

}
