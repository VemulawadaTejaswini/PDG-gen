import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        int[] ss = new int[28];
        int[] tt = new int[28];
        boolean f = false;
        for(int i = 0;i < 28;i++){
            ss[i] = -1; tt[i] = -1;
        }
        for(int i = 0;i < s.length();i++){
            char c = s.charAt(i);
            char cc = t.charAt(i);
            if(ss[c-'a'] < 0){
                ss[c-'a'] = cc-'a';
            }else if(ss[c-'a'] != cc-'a'){
                f = true;
                break;
            }
            if(tt[cc-'a'] < 0){
                tt[cc-'a'] = c-'a';
            }else if(tt[cc-'a'] != c-'a'){
                f = true;
                break;
            }
        }
        if(f)   System.out.println("No");
        else    System.out.println("Yes");
    }
}