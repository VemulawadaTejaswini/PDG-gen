import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt(), G = sc.nextInt(), B = sc.nextInt(), N = sc.nextInt();
        int ans = 0;
        for (int i = 0; i < N/R+1; i++) {
            int r = i;
            for (int j = 0; j < (N-R*r)/G+1; j++) {
                int g = j;
                if (N-R*r-G*g >= 0 && (N-R*r-G*g) % B == 0)
                    ans += 1;
            }
        }
        System.out.println(ans);
    }
}
