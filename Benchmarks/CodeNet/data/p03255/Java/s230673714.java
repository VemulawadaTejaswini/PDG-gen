import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long X = sc.nextLong();
        long[] p = new long[n];
        for(int i=0;i<n;i++) p[i] = sc.nextLong();
        long ans = n*X;
        int cnt = 0;
        while(cnt<n){
            ans += X+5*p[n-1-cnt];
            cnt++;
            int cur=1;
            for(int i=n-1-cnt;i>=0;i--){
                long less = 5*p[i]+X;
                long more = (2*cur+3)*p[i];
                if(more>less) break;
                else{
                    cur++;
                    cnt++;
                    ans += more;
                }
            }
        }
        System.out.println(ans);
    }
}
// ["a","ba","bc","bcb","bcd","bd"]
// "abcd"