import java.util.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.ArrayDeque;
import java.util.Deque;


public class Main {
    static int count = 0;
    static int ws = 0;
    static char[] s;
    
    public static void main(String[] args) throws Exception {
        // Your code here!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        s = new char[S.length()];
        int bcount = 0;
        int ans = 0;
        
        for (int i = 0; i < s.length; i++) {
            s[i] = S.charAt(i);
        }
        //int count = 0;
        
        for (int i = 0; i < s.length; i++) {
            if (s[i] == 'B') {
                bcount++;
            }
            if (s[i] == 'W') {
                ans += bcount;
            }
        }
        
        System.out.println(ans);
        
        
        
    }
    
    
}
