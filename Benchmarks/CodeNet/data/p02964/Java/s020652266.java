import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        // int n = Integer.parseInt(bf.readLine());
        StringTokenizer st = new StringTokenizer(bf.readLine());
        //
        int n = Integer.parseInt(st.nextToken());
        long k = Long.parseLong(st.nextToken());
        st = new StringTokenizer(bf.readLine());
         int[] a = new int[n]; for(int i=0; i<n; i++) a[i] = Integer.parseInt(st.nextToken());
         int[] next = new int[n];
         int[] prev = new int[200001];
         Arrays.fill(prev, -1);
         for(int i=0; i<2*n; i++) {
            int j = i%n;
            if(prev[a[j]] != -1) {
              next[prev[a[j]]] = j;
            }
            prev[a[j]] = j;
         }
        // System.out.println(Arrays.toString(next));
         int count = 1; int pointer = 0;
         while(true) {
           int nextval = next[pointer];
           if(nextval <= pointer) count++;
           pointer = nextval + 1;
           //System.out.println(pointer);
           if(pointer == n) break;
         }
         k %= count;
         if(k == 0) {
           out.println();
           out.close();
           System.exit(0);
         }
         count = 1;
         pointer = 0;
         while(true) {
           int nextval = next[pointer];
           if(nextval <= pointer) {
             if(count == k) {
               StringBuilder sb = new StringBuilder();
               for(int i=pointer; i<n; i++) {
                 if(next[i] <= i) sb.append(a[i] + " ");
                 else i=next[i];
               }
               out.println(sb.toString());
               out.close(); System.exit(0);
             }
             count++;
           }
           pointer = nextval + 1;
           if(pointer == n) break;
         }
        out.close(); System.exit(0);
    }
}
