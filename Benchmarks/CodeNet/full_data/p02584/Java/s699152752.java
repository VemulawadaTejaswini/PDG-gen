import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        long x = sc.nextLong();
        long k = sc.nextLong();
        long d = sc.nextLong();

        if(Math.abs(x) >= k * d){
            System.out.println(Math.abs(x) - k * d);
            return;
        }
        long l = k - Math.abs(x) / d;
        long y = x - d * (Math.abs(x) / d);

        if(l % 2 == 0){
            System.out.println(Math.abs(y));
        }else{
            System.out.println(Math.abs(d) - y);
        }

    }
}
