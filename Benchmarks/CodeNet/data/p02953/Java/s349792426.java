import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());

        boolean ans = true;
        long v = 0;
        
        long[] h = new long[N];
        h[0] = Long.parseLong(sc.next());
        for(int i = 1; i < N; i++) {
            h[i] = Long.parseLong(sc.next());
            if(h[i-1] - h[i] > 1) {
                ans = false;
                break;
            }else if(h[i-1] - h[i] == 1) {
                if(v == 0) {
                    v++;
                }else {
                    ans = false;
                }
            }
        }
        
        if(ans) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}