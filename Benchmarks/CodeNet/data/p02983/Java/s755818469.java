import java.util.*;

public class Main {
    static final int MOD = 2019;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int left = sc.nextInt();
        int right = sc.nextInt();
        if(right - left + 1 >= MOD) {
            System.out.println(0);
            System.exit(0);
        }
        
        int [] rad = new int [right + 1];
        
        for(int i = left ; i <= right; i++) {
            rad[i] = i % MOD;
        }
        
        int ans = minRad(rad, left, right-1) * minRad(rad, left+1, right);
        System.out.println(ans);
    }
    
    static int minRad(int [] num, int start, int end) {
        int min = MOD;
        for(int i = start ; i <= end; i++) {
            min = Math.min(num[i], min);
        }
        return min;
    }
}