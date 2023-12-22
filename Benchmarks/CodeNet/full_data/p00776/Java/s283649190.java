import java.util.*;
import java.io.*;

public class Main {
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(;;) {
            char [] inc = br.readLine().toCharArray();
            if (inc[0] == '#') break;
            final int n = inc.length;
            int [] in = new int[n];
            int [] tmp = new int[n];
            char [] ans = new char[n];
            LinkedList<String> hs = new LinkedList<String>();
            LinkedList<String> ts = new LinkedList<String>();
            int count = 0;
            for(int i = 0; i < n; i++) in[i] = inc[i];
            // Brute Force Attack!
            for(int i = 0; i < 1 << n; i++) {
                for(int k = 0, f = 1<<(n-1); k < n; k++, f>>=1) {
                    tmp[k] = ((i & f) != 0) ? in[k] + 1 : in[k];
                    ans[k] = (char)tmp[k];
                }
                for(char c = 'b'; c <= 'z'; c++) {
                    for(int k = 0; k < n; k++) {
                        if(tmp[k] == c) {
                            tmp[k]--;
                            break;
                        }
                    }
                }
                boolean ok = true;
                for(int k = 0; k < n; k++) {
                    if((in[k] != tmp[k]) || ans[k]>'z') ok = false;
                }
                if(ok) {
                    count++;
                    if(hs.size()<5) {
                        hs.add(new String(ans));
                    } else {
                        if(ts.size() >= 5) {
                            ts.remove(0);
                        }
                        ts.add(new String(ans));
                    }
                }
            }
            System.out.println(count);
            for(int i = 0; i < hs.size(); i++) {
                System.out.println(hs.get(i));
            }
            for(int i = 0; i < ts.size(); i++) {
                System.out.println(ts.get(i));
            }
        }
    }
}