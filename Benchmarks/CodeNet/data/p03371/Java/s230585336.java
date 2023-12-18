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

        long ans1 = 0;
        long ans2 = 0;
        long ans3 = 0;


        if( C * 2 <  A + B){

            if(X > Y){
                if(A < C * 2){
                    ans1 = C*2*Y + A*(X-Y);
                }else{
                    ans1 = C*2*Y + C*2*(X-Y);
                }
            }else{
                if(A < C * 2){
                    ans2 = C*2*Y + A*(Y-X);
                }else{
                    ans2 = C*2*Y + C*2*(Y-X);
                }
            }
            
            System.out.println(ans1 > ans2 ? ans2:ans1);
            return;

        }else{

            ans3 = A*X + B*Y;
            System.out.println(ans3);
            return;
        }
        
    }
}