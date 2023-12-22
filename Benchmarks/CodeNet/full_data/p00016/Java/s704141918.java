import java.util.*;
import java.math.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static double X, Y, r, angle,an;
    static String[] input;
    public static void main(String[] args) {
        while(read()){
            solve();
        }
        System.out.println((int)Y);
        System.out.println((int)X);
    }

    static boolean read(){
        input = sc.next().split(",");
        r = Integer.parseInt(input[0]);
        an = Integer.parseInt(input[1]);
        if(r == 0 && an == 0)return false;
        return true;
    }

    static void solve(){
        X = X + r*Math.cos(angle*Math.PI/180);
        Y = Y + r*Math.sin(angle*Math.PI/180);
        if(angle < 0)angle = angle + 360;
        angle = (angle + an)%360;
    }

}