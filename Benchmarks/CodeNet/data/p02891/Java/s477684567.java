import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        long k = sc.nextLong();
        int n = s.length();
        sc.close();

        long ans = 0;
        if(s.charAt(0) != s.charAt(n-1)){
            int idx = 0;
            while(idx < n-1){
                if(s.charAt(idx)==s.charAt(idx+1)){
                    ans++;
                    idx++;
                }
                idx++;
            }
            ans *= k;
        } else {
            if(allsame(s)){
                ans = (n*k)/2;
            } else {
                int l = 0;
                int r = n-1;
                while(s.charAt(l) == s.charAt(l+1)){
                    l++;
                }
                while(s.charAt(r) == s.charAt(r-1)){
                    r--;
                }
                int idx = 0;
                while(idx < n-1){
                    if(s.charAt(idx)==s.charAt(idx+1)){
                        ans++;
                        idx++;
                    }
                    idx++;
                }
                ans *= k;
                ans += ((l+1)+(n-r))/2;
                ans -= (l+1)/2;
                ans -= (n-r)/2;
                
            }
            
        }
        System.out.println(ans);
    }

    static boolean allsame(String s){
        for(int i = 0; i < s.length()-1; i++){
            if(s.charAt(i)!=s.charAt(i+1))
                return false;
        }
        return true;
    }
}