
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Iterator;

class Main {

    static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        long rep = sc.nextInt();
        char[] sq = S.toCharArray();
        long ans = 0;
        for(int i=1;i<sq.length;i++){
            if(sq[i-1]==sq[i]){
                sq[i]='.';
                ans++;
            }
        }
        if(sq[0] == sq[sq.length-1]){
            String S2 = new String(sq)+S;
            long a1 = ans;
                
            char[] sq2 = S2.toCharArray();
            for(int i=1;i<sq2.length;i++){
                if(sq2[i-1]==sq2[i]){
                    sq2[i]='.';
                    ans++;
                }
            }
            ans = ans*(rep/2)+a1*(rep%2);
            //System.out.println(new String(sq2));
        }else{            
            ans*=rep;
        }
        System.out.println(ans);
    }
}