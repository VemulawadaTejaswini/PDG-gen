import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next(), t = sc.next();
        int s_len = s.length();
        int t_len = t.length();
        String ans = "";
        int k = -1;
        for(int i = s_len - t_len; i >= 0; i--){
            boolean flag = true;
            for(int j = 0; j < t_len; j++)
                if(s.charAt(i+j) != t.charAt(j) && s.charAt(i+j) != '?'){
                    flag = false;
                    break;
                }
            if(flag) k = i;
        }
        if(k < 0) System.out.println("UNRESTORABLE");
        else{
            for(int i = 0; i < k; i++){
                if(s.charAt(i) != '?')
                    ans += s.charAt(i);
                else ans += 'a';
            }
            for(int i = k; i < k + t_len; i++)
                ans += t.charAt(i - k);
            for(int i = k + t_len; i < s_len; i++)
                 if(s.charAt(i) != '?')
                    ans += s.charAt(i);
                 else ans += 'a';
            System.out.println(ans);
        }
    }
}