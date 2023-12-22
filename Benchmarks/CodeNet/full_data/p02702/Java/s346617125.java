import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int len = s.length();
        long ans = 0;
        for(int i = 0; i < 4; i++){
            int left = i;
            int right = i+4;
            int chain = 0;
            while(left < len && right <= len){
                if(right - left >= 11){
                    left = right;
                    right  += 4;
                    continue;
                }
                if(Long.parseLong(s.substring(left,right)) % 2019 == 0){
                    //System.out.println(left + " " + right);
                    ans++;
                    chain++;
                    left = right-1;
                    right += 4;
                }else{
                    ans += fact(chain);
                    chain = 0;
                    right++;
                }
            }
        }
        System.out.println(ans);
    }
    
    public static long fact(int f){
        long ret = 0;
        for(int i = 1; i <= f-1; i++){
            ret += i;
        }
        return ret;
    }
}
