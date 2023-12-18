
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w,h,x,y;
        double a; int b = 0;
        w = sc.nextInt();
        h = sc.nextInt();
        x = sc.nextInt();
        y = sc.nextInt();
        a = (double)w*(double)h/2;
        if(w/2==x&&h/2==y) {
            b = 1;
        }
        System.out.println(a+" "+b);
    }
}
