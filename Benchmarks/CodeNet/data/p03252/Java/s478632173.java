import java.util.HashSet;
import java.util.Set;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] s = br.readLine().toCharArray();
        char[] t = br.readLine().toCharArray();
        
        boolean[] s_existing = new boolean[26];
        boolean[] t_existing = new boolean[26];
        
        char[] st_corresponding = new char[26];
        char[] ts_corresponding = new char[26];
        
        //System.out.println((int)'a');
        
        boolean flag = true;
        for (int i = 0; i < s.length; i++) {
            if (s_existing[(int)s[i]-97]) {
                if (t[i] != st_corresponding[(int)s[i]-97]) {
                    flag = false;
                    break;
                }
            }
            if (t_existing[(int)t[i]-97]) {
                if (s[i] != ts_corresponding[(int)t[i]-97]) {
                    flag = false;
                    break;
                }
            }
            if (!s_existing[(int)s[i]-97] && !t_existing[(int)t[i]-97]) {
                s_existing[(int)s[i]-97] = true;
                t_existing[(int)t[i]-97] = true;
                
                st_corresponding[(int)s[i]-97] = t[i];
                ts_corresponding[(int)t[i]-97] = s[i];
                
            }
        }
        
        
        if (flag) System.out.println("Yes");
        else System.out.println("No");
        
        
        
    }
}
