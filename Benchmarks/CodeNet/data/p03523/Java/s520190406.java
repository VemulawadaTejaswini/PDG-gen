import java.util.*;
import java.io.*;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String ans = help(s)?"YES":"NO";
        System.out.println(ans);
    }
    static boolean help(String s){
        String t = s.replace("A","");
        if(!t.equals("KIHBR")) return false;
        int[] rec = new int[5];
        int k=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='A') rec[k++]=i;
        }
        return rec[0]<=1&&(rec[1]-rec[0]==1)&&(rec[2]-rec[1]==1)&&(rec[3]-rec[2]<=2)&&(rec[4]-rec[3]<=2)&&(s.length()-1-rec[4]<=1);
    }
}
