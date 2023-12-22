import java.util.*;

public class Main {
    private static final Scanner scn = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n, m, p;
        while((n = scn.nextInt()) > 0) {
            m = scn.nextInt();
            p = scn.nextInt();
            System.out.println(gamble(n, m, p));
        }
    }
    
    private static int gamble(int n, int m, int p) {
        int num = 0, sum = 0;
        for(int i = 1; i <= n; i++) {
            int tmp = scn.nextInt();
            if(i == m) {
                num = tmp;
            }
            sum += tmp;
        }
        return num > 0 ? (100 - p) * sum / num : 0;
    }
}