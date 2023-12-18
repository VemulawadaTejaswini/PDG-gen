import java.util.*;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long[] an = new long[5];
        an[0] = sc.nextLong();
        an[1] = sc.nextLong();
        an[2] = sc.nextLong();
        an[3] = sc.nextLong();
        an[4] = sc.nextLong();

        long min = Long.MAX_VALUE;
        for(int i =0;i < 5;i++){
            min = an[i] < min ? an[i] : min;
        }
        long ans = (long)Math.ceil((double)(n-min)/min);
        System.out.println(ans+5);
    }
}
