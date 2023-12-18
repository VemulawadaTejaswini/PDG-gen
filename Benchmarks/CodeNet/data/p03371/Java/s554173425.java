import java.lang.reflect.Array;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int A = Integer.parseInt(scan.next());
        int B = Integer.parseInt(scan.next());
        int C = Integer.parseInt(scan.next());
        int X = Integer.parseInt(scan.next());
        int Y = Integer.parseInt(scan.next());

        long ans1;
        long ans2;


        if(X == Y){
            ans1 = A * X + B * Y;
            ans2 = C * 2 * X;
            System.out.println( ans1 > ans2 ? ans2:ans1);
            return;
        }

        if(X > Y){
            ans1 = A * X + B * Y;
            if(C*2 < A && C*2 < B){
                ans2 = C * 2 * X;
            }else{
                ans2 = C * 2 * Y + A*(X-Y);
            }
            System.out.println( ans1 > ans2 ? ans2:ans1);
            return;

        }else if(Y > X){
            ans1 = B * Y + A * X;
            if(C*2 < A && C*2 < B){
                ans2 = C * 2 * Y;
            }else{
                ans2 = C * 2 * X + B*(Y-X);
            }
            System.out.println( ans1 > ans2 ? ans2:ans1);
            return;
        }
    }
}