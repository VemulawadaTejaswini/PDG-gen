import java.util.*;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int p = sc.nextInt();
            
            if (n==0&&m==0&&p==0) break;
            
            int r = 0;
            int sum = 0;
            for (int i = 1; i <=n; i++) {
                int tmp = sc.nextInt();
                sum += tmp;
                if (i == m) {
                    r = tmp;
                }
            }
            
            if (r > 0) {
                sum *= (100-p);
                sum /= r;
                System.out.println(sum);
            } else {
                System.out.println(0);
            }
        }
    }
}