import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int len = s.length();
        int ans = len;
        for(int i=len-1;i>=2;i--){
            String cur = s.substring(0,i);
            if(helper(cur)){
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }
    static private boolean helper(String s){
        int len = s.length();
        if(len%2==1) return false;
        String front = s.substring(0,len/2);
        String end = s.substring(len/2,len);
        return front.equals(end);
    }
}
