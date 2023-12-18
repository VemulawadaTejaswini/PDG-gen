import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        int ans = (int) (A/0.08);
        boolean flag = false;

        for (Double i = 0.0; i < 1.0; i += 0.1) {
            for (Double j = 0.0; j < 1.0; j += 0.1) {
                int x = (int) ((A + i) / 0.08);
                int y = (int) ((B + j) / 0.10);
                if (x == y && ans >= x) {
                    ans = x;
                    flag = true;
                    break;
                }
            }
        }
        if(!flag) { ans = -1; }

        System.out.println(ans);
        sc.nextLine();
    }
}