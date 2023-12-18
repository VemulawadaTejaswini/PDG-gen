import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        int cnt1 = 0, cnt2 = 0;
        char L = s.charAt(0);
        char R = s.charAt(n-1);
        boolean flag1 = true, flag2 = true;
        for(int i = 0; i < n; i++){
            if(s.charAt(i) == L && flag1){
                cnt1++;
            }else{
                flag1 = false;
            }
            if(s.charAt(n - 1 - i) == R && flag2){
                cnt2++;
            }else{
                flag2 = false;
            }
        }
        System.out.println(n - Math.min(cnt1, cnt2));
    }
}