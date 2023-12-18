import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        Long r = 0l;
        Long l = 0l;
        Long res = 0l;
        for(int i = 0;i < S.length();i++){
            if(S.charAt(i) == '<'){
                r++;
                if(l > 0){
                    if(r > l){
                        res = res + ((r * (r + 1)) + (l * (l - 1))) / 2;
                    }else{
                        if(r != 0){
                            res = res + ((r * (r - 1)) + (l * (l + 1))) / 2;
                        }else{
                            res = res + (l * (l + 1)) / 2;
                        }
                    }
                    r = 0l;
                    l = 0l;
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
                    if(r != 0){
                        res = res + ((r * (r - 1)) + (l * (l + 1))) / 2;
                    }else{
                        res = res + (l * (l + 1)) / 2;
                    }
                }
            }else{
                res = res + (r * (r + 1)) / 2;
            }
        }
        
        System.out.println(res);
    }
}
