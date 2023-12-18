import java.util.*;

class Main {
    static int n;
    static int m;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        String S = sc.next();
        String T = sc.next();
        long ans = help(S,T);
        System.out.println(ans);
    }
    static long help(String s, String t){
        for(int x2=0;x2<=m-1;x2++){
            long cur = ((long)n*x2);
            if(cur%((long)m)==0){
                int now = (int) (cur/((long) m));
                if(now<n){
                    if(s.charAt(now)!=t.charAt(x2)) return -1;
                }
            }
        }
        return ((long)n)/((long)gcd(m,n))*((long)m);
    }
    static int gcd(int m, int n){
        if(m<n){
            int temp = m;
            m = n;
            n = temp;
        }
        if(m%n==0) return n;
        else return gcd(n, m%n);
    }
}
