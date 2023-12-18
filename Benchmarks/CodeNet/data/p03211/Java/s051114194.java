import java.util.*;
class Main
{
    static int MOD = 1000000007;
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        int ans = 100000;
        for(int i = 0; i < n - 2; i++){
            int x = Integer.parseInt(String.valueOf(s.charAt(i))) * 100 + 
            Integer.parseInt(String.valueOf(s.charAt(i+1))) * 10 + Integer.parseInt(String.valueOf(s.charAt(i + 2)));
            ans = Math.min(ans, Math.abs(753 - x));
        }
        System.out.println(ans);
    }
}