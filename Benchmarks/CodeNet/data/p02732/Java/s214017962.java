import javax.swing.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        PrintWriter pw = new PrintWriter(System.out);
        
        int n = Integer.parseInt(br.readLine());
        HashMap<Integer, Integer> hm = new HashMap<>();
        st = new StringTokenizer(br.readLine());
        long ans = 0;
        int[] a = new int[n];
        for(int i=0 ; i<n ; i++) {
            int x = Integer.parseInt(st.nextToken());
            a[i] = x;
            if(hm.containsKey(x)) {
                hm.compute(x, (y, z) -> z+1);
            }
            else {
                hm.put(x, 1);
            }
        }

        for(Map.Entry<Integer, Integer> ent: hm.entrySet()) {
            long val = ent.getValue();
            val *= (val-1);
            val /= 2;
            ans += val;
        }

        for(int i=0 ; i<n ; i++) {
            long occur = hm.get(a[i]);
            long curr = ans;
            curr -= occur*(occur-1)/2;
            curr += (occur-1)*(occur-2)/2;
            pw.println(curr);
        }
        
        
        
        
        
        pw.flush();
        pw.close();
    }
}
