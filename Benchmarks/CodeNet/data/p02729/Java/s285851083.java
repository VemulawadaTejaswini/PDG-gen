import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int n,m,ans;
        
        n = sc.nextInt();
        m = sc.nextInt();
        
        
        ans = ((n + m) * (n + m - 1)) / 2 - (n * m);
        
        
        System.out.println(ans);
    }
}
