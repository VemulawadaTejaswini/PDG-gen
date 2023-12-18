import java.util.*;
import java.io.*;

import static java.lang.System.in;

public class Main {
    static int[] bit;
    static int n;
    public static void main(String[] args)throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        String temp;
        String[] buf;
        temp = reader.readLine();
        int N = Integer.parseInt(temp.split(" ")[0]);
        int[] a = new int[N], sorted = new int[N];
        temp = reader.readLine();
        buf = temp.split(" ");
        for(int i=0;i<N;i++){
            int cur = Integer.parseInt(buf[i]);
            a[i] = cur;
            sorted[i] = cur;
        }
        Arrays.sort(sorted);
        int smaller = sorted[n/2-1], bigger = sorted[n/2];
        PrintWriter out = new PrintWriter(System.out);
        int ans = 0;
        for(int i=0;i<N;i++){
            if(a[i]<=smaller) ans = bigger;
            else ans = smaller;
            out.println(ans);
        }
        out.flush();
    }
}