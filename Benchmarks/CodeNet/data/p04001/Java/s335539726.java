import java.util.*;
 
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String[] sp = S.split("");
        int n = sp.length;
        int[] s = new int[n];
        for(int i=0; i<n; i++) {
            s[i] = Integer.parseInt(sp[i]);
        }
        long sum = 0;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<Math.pow(2, n-1); i++) {
            sb = new StringBuilder(String.valueOf(s[0]));
            for(int j=0; j<n-1; j++) {
                if((1 & i >> j) == 1) {
                    sum += Long.parseLong(String.valueOf(sb));
                    sb = new StringBuilder();
                }
                sb.append(s[j+1]);
            }
            sum += Long.parseLong(String.valueOf(sb));
        }
        System.out.println(sum);
    }
    
    
}