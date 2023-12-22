import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long r = 1;
        boolean existZero = false;
        boolean overThres = false;
        for(int i=1; i<=N; i++) {
            long tmp = sc.nextLong();
            r = r * tmp;
            if(tmp==0L) {
                existZero = true;
            }
            if(r>1000000000000000000L) {
                overThres = true;
            }
        }
        if(existZero) {
            System.out.println(0);
            return;
        }
        if(overThres) {
            System.out.println(-1);
            return;
        }
        System.out.println(r);
    }
}
