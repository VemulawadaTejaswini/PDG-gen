import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int r = 0;
        int l = 0;
        int res = 0;
        for(int i = 0;i < S.length();i++){
            if(S.charAt(i) == '<'){
                r++;
                if(l > 0){
                    if(r > l){
                        res = res + ((r * (r + 1)) + (l * (l - 1))) / 2;
                    }else{
                        res = res + ((r * (r - 1)) + (l * (l + 1))) / 2;
                    }
                    r = 0;
                    l = 0;
                }
            }else{
                l++;
            }
        }
        if(r > 0){
            if(l > 0){
                if(r > l){
                    res = res + ((r * (r + 1)) + (l * (l - 1))) / 2;
                }else{
                    res = res + ((r * (r - 1)) + (l * (l + 1))) / 2;
                }
            }else{
                res = res + (r * (r + 1)) / 2;
            }
        }
        
        System.out.println(res);
    }
}
