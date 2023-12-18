import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        int nowl = -1;
        int nowr = 1000000;
        
        int count = 1;
        while (k-- > 0) {
            if (count == n - 1) break;
            int l = sc.nextInt();
            int r = sc.nextInt();
            
            if (r <= nowl || nowr <= l) {
                count++;
                nowl = l;
                nowr = r;
                continue;
            }
            
            if (nowl < l) {
                nowl = l;
            }
            if (r < nowr) {
                nowr = r;
            }
        }
        
        System.out.println(count);
    }
}
