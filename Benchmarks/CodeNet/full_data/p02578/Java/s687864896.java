import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long total = 0L;
        long tmp = sc.nextLong();
        for(int i=1; i<N; i++) {
            long now = sc.nextLong();
            if(now==tmp) continue;
            if(now<tmp) {
                total += tmp - now;
            } else {
                tmp = now;
            }
        }
        System.out.println(total);
    }
}
