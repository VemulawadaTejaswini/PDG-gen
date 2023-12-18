import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
    
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i <= S.length() -3; i++){
            int sum = 0;
            for(int j = 0; j < 3; j++){
                int x = S.charAt( i+j ) - '0';
                x *= Math.pow(10, 2-j);
                sum += x;
            }
            
            ans = Math.min( ans, Math.abs(753 - sum) );
        }
        
        System.out.println(ans);
    }
}
