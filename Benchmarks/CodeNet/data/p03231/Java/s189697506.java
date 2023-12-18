import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[] s = sc.next().toCharArray();
        char[] t = sc.next().toCharArray();
        int len = lcm(n, m);
        char[] ans = new char[len+1];
        Arrays.fill(ans, '0');
        int spow = len/n;
        for(int i = 0; i < n; i++){
            ans[spow*i] = s[i];
        }
        int tpow = len/m;
        for(int i = 0; i < m; i++){
            if(ans[tpow*i] != '0' && ans[tpow*i] != t[i]){
                System.out.println(-1);
                return;
            }
        }
        System.out.println(len);
    }
    
    private static int gcd(int a, int b){
        while (b > 0)
        {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    private static int lcm(int a, int b){
        return a * (b / gcd(a, b));
    }
}