import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int L = sc.nextInt();
        int ans=0;
        for (int i=0; i<N; i++) {
            ans = ans + (L+i);
        }
        
        if (L >= 0) {
            ans = ans - L;
        } else if (L+N <= 0) {
            ans = ans - (L+N-1);
        }
        System.out.println(ans);
    }
}
