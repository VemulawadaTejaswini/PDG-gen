import java.util.*;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        long mx = (long)Math.pow(10, 18);
        
        long ans = 1;
        for(int i = 0; i < n; i++) {
            long next = sc.nextLong();
            if(next == 0) {
                ans = 0;
                break;
            }
            if(ans > (mx+1)/next || ans*next > mx) {
                ans = -1;
                break;
            }
            ans *= next;
        }
        System.out.println(ans);
    }
}