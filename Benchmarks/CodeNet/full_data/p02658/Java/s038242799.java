import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sn = new Scanner(System.in);
        
        int n = sn.nextInt();
        long a[] = new long[n];
        long ans = 1l;
        
        for(int i = 0; i < n; i++) {
            a[i] = sn.nextLong();
            ans = ans * a[i];
        }
        
        if(ans > 1000000000000000000l) {
            System.out.print("-1");
            return;
        }
        System.out.println(ans);
    }
}
