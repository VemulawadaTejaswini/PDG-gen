import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int cnt = 0, ans = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'W'){
                ans += i - cnt;
                cnt++;
            }
        }
        System.out.println(ans);
    }
}