import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        int [] num = new int [n+1];
        
        for(int i = 0; i < n; i++) {
            int tmp = 1;
            if(s.charAt(i) == '0') tmp = -1;
            num[i+1] = num[i] + tmp;
        }
        
        int ans = 0;
        for(int i = 0; i <= n; i++) {
            for(int j = n; j > i; j--) {
                if(num[i] == num[j]) {
                    ans = Math.max(ans, j-i);
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}