import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        double h = sc.nextDouble();
        double ans = 1;
        double now = 1;
        double nowmax = Math.pow(2,now) -1;
     	while(h >  nowmax){
          ans += Math.pow(2,now);
          now += 1;
          nowmax = Math.pow(2,now) -1;
        }
      System.out.println((long)ans);
 }
}