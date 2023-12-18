/*
文字列の配列の初期化、整数の型がlongになっているか
関数（splitとかcontainsとか）内では"+"とかは正規表現となされるので"\\+"とする
 */
import java.util.*;
import java.awt.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] $) {
        Scanner sc = new Scanner(in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int e=sc.nextInt();
        int f=sc.nextInt();
        Deque<Integer> water=new ArrayDeque<>();
        Deque<Integer> sugar=new ArrayDeque<>();
        String ans=0+" "+0;
        water.addFirst(100*a);
        sugar.addFirst(0);
        water.addFirst(100*b);
        sugar.addFirst(0);
        double density=0;
        while (!water.isEmpty()){
            int w=water.poll(),s=sugar.poll();
            if((double)s*100/(double)(s+w)>density){
                density=(double)s*100/(double)(s+w);
                ans=(s+w)+" "+s;
              //  out.println(ans);
            }
            //操作1
//            if(w+100*a+s<=f&&s<=(w+100*a)/100*e){
            if(w+100*a+s<=f&&s<=(w+100*a)/100*e){
                water.addFirst(w+100*a);
                sugar.addFirst(s);
            }
            //操作2
            if(w+100*b+s<=f&&s<=(w+100*b)/100*e){
                water.addFirst(w+100*b);
                sugar.addFirst(s);
            }
            //操作3
            if(w+s+c<=f&&s+c<=w/100*e){
                water.addFirst(w);
                sugar.addFirst(s+c);
            }
            //操作4
            if(w+s+d<=f&&s+d<=w/100*e){
                water.addFirst(w);
                sugar.addFirst(s+d);
            }
        }
        out.println(ans);
    }
}