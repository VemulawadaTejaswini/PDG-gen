/*
    Those who cannot remember the past are condemned to repeat it.
                                            - Dynamic Programming
    
    I never lose, I either win or I learn.
                - Competitive Programming

*/

import javax.print.DocFlavor;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

class Pair {
    long x;
    long y;
    Pair(long u, long v) {
        x = u;
        y = v;
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        PrintWriter pw = new PrintWriter(System.out);

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        long d = Long.parseLong(st.nextToken());
        long a = Long.parseLong(st.nextToken());

        Pair[] p = new Pair[n];

        for(int i=0 ; i<n ; i++) {
            st = new StringTokenizer(br.readLine());
            long u = Long.parseLong(st.nextToken());
            long v = Long.parseLong(st.nextToken());
            p[i] = new Pair(u, v);
        }

        Arrays.sort(p, (o1, o2) -> (int)(o1.x-o2.x));

        int l = 0;
        int r = 0;
        long ans = 0;
        long reduce = 0;
        long[] lazy = new long[n+2];
        for(int i=0 ; i<n ; i++) {
            reduce += lazy[i];
            p[i].y -= reduce*a;
            if(p[i].y <= 0) continue;
            long val = p[i].x;
            long go_to = val+2*d;
            while(r < n && p[r].x <= go_to) {
                r++;
            }
            long reduce_at_this_step = p[i].y%a == 0 ? p[i].y/a : p[i].y/a+1;
            lazy[r] += -reduce_at_this_step;
            reduce += reduce_at_this_step;
            ans += reduce_at_this_step;
        }

        pw.println(ans);
        
        pw.flush();
        pw.close();
    }
}
