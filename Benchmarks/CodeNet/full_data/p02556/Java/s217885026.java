import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        long aMin = Long.MAX_VALUE, aMax = Long.MIN_VALUE;
        long bMin = Long.MAX_VALUE, bMax = Long.MIN_VALUE;
        for(int n=0; n<N; n++){
            long x = sc.nextLong();
            long y = sc.nextLong();

            long a = x-y, b = x+y;
            System.err.printf("(%d,%d) -> [%d,%d]\n", x,y, a,b);
            aMin = Math.min(aMin, a);
            aMax = Math.max(aMax, a);
            bMin = Math.min(bMin, b);
            bMax = Math.max(bMax, b);
        }

        System.out.println(Math.max(aMax-aMin, bMax-bMin));
    }
}