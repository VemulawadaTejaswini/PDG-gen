import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int len = s.length();
        long ans = 0;
        for(int i = 0; i < len; i++){
            for(int j = i+4; j <= len; j++){
                if(j - i >= 19) break;
                String tmp = s.substring(i,j);
                long tmpl = Long.parseLong(tmp);
                if(tmpl % 2019 == 0){
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}