import java.util.*;

class Main {
    // 150d
    static final long MOD = 1_000_000_007;
    static final int MAX = 2000000000;
    static final int INF = 100000000;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char[] str = sc.next().toCharArray();
        int n = sc.nextInt();
        long ans = 0;
        for(int i = 0;i < str.length-1;i++){
            if(str[i] == str[i+1]){
                ans++;
                str[i+1] = '*';
            }
        }
        ans *= n;
        if(str[0]==str[str.length-1])ans += n-1;
        System.out.println(ans);
    }
}
