import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long s = sc.nextLong();
        long x2=0, x3=0, y2=1, y3=0;
        if(1_000_000_000 < s){
            x2 = 1_000_000_000;
            y3 = (long)Math.ceil((double)s /1_000_000_000);
            x3 = x2*y3 - s;
        }else {
            x2 = s; y3 = 1; x3 = 0;
        }
        System.out.println(0 + " " + 0 + " " + x2 + " " + y2 + " " + x3 + " " + y3);
        sc.close();

    }

}
