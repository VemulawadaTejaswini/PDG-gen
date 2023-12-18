import java.util.*;
class Main
{
    static int[][] c;
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String x = "keyence";
        int n = s.length();
        int m = x.length();
        String ans = "NO";
        for(int i = 0; i < n - m; i++){
            int cnt = -1;
            boolean flag = true;
            for(int j = 0; j < i; j++){
                if(s.charAt(j) != x.charAt(++cnt)){
                    flag = false;
                }
            }
            for(int j = n - m + i; j < n; j++){
                if(s.charAt(j) != x.charAt(++cnt)){
                    flag = false;
                }
            }
            if(flag) ans = "YES";
        }
        if(s.compareTo(x) == 0)ans = "YES";
        System.out.println(ans);
    }
}