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
        char[] S = s.toCharArray();
        int n = S.length;
        Integer[] rec = new Integer[3];
        Arrays.fill(rec,0);
        for(char w:S) rec[w-'a']++;
        Arrays.sort(rec,Collections.reverseOrder());
        for(int i=0;i<n;i++){
            if(rec[i%3]<=0) return false;
            rec[i%3]--;
        }
        return true;
    }
}
