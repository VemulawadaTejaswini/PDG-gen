import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] s = sc.next().toCharArray();
        int[] b = new int[n];
        int[] w = new int[n];
        if(s[0] == '.') w[0] = 1;
        else b[0] = 1;
        for (int i = 1; i < n; i++) {
            b[i] = b[i-1];
            w[i] = w[i-1];
            if(s[i] == '.') w[i]++;
            else b[i]++;
        }
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i <= n; i++) {
            if(i == 0){
                ans = Math.min(ans, w[n-1]);
            }else if(i == n){
                ans = Math.min(ans, b[n-1]);
            }else{
                ans = Math.min(ans, b[i-1] + (w[n-1] - w[i-1]));
            }
        }
        System.out.println(ans);
        sc.close();
    }

}
