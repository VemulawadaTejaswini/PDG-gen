import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        long k = sc.nextInt();
        
        int ln = s.length();
        char c = s.charAt(0);
        boolean all_same = true;
        int count=1, borderF=1, borderL=0, pos=0;
        long ans=0;
        
        if(c == s.charAt(ln-1)){
            for(int i=1; i<ln-1; i++){
                if(c != s.charAt(i)){
                    all_same = false;
                    break;
                }
            }
            if(all_same){
                ans = ln*k/2;
            }else{
                for(int i=1; i<ln; i++){
                    if(c == s.charAt(i)){
                        borderF++;
                    }else{
                        c = s.charAt(i);
                        pos=i;
                        break;
                    }
                }
                for(int i=pos+1; i<ln; i++){
                    if(c == s.charAt(i)){
                        count++;
                    }else{
                        ans += count/2;
                        c = s.charAt(i);
                        count = 1;
                    }
                }
                borderL = count;
                ans *= k;
                long borderAns = (borderL+borderF)/2;
                borderAns *= (k-1);
                ans += borderAns;
                ans += (borderF/2);
                ans += (borderL/2);
            }
        }else{
            for(int i=1; i<ln; i++){
                if(c == s.charAt(i)){
                    count++;
                }else{
                    ans += count/2;
                    c = s.charAt(i);
                    count = 1;
                }
            }
            ans += count/2;
            ans *= k;
        }
        
        System.out.println(ans);
    }
}
