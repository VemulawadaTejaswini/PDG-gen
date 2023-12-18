import java.util.*;
public class Main{
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] r = new int[n];
        boolean[] b = new boolean[n];
        
        for(int i= 0; i < n; i++) {
            r[i] = in.nextInt() - 1;
        }
        
        int ans = 0;
        
        for(int i = 0; i < n; i++) {
            if(!b[i] && i == r[r[i]]) {
                b[i] = b[r[i]] = true;
                ans++;
            }
        }
        
        System.out.println(ans);
    }
}