import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Main {

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner() {
            try {
                br = new BufferedReader(new InputStreamReader(System.in));
                st = new StringTokenizer(br.readLine());
            } catch (Exception e){e.printStackTrace();}
        }

        public String next() {
            if (st.hasMoreTokens()) return st.nextToken();
            try {st = new StringTokenizer(br.readLine());}
            catch (Exception e) {e.printStackTrace();}
            return st.nextToken();
        }

        public int nextInt() {return Integer.parseInt(next());}

        public long nextLong() {return Long.parseLong(next());}

        public double nextDouble() {return Double.parseDouble(next());}

        public String nextLine() {
            String line = "";
            if(st.hasMoreTokens()) line = st.nextToken();
            else try {return br.readLine();}catch(IOException e){e.printStackTrace();}
            while(st.hasMoreTokens()) line += " "+st.nextToken();
            return line;
        }
    }

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        PrintWriter pw = new PrintWriter(System.out);

        int n = sc.nextInt();
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();

        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();

        for(int i=0;i<n;i+=2) {
            int a = arr[i];
            map1.put(a, map1.getOrDefault(a, 0) + 1);
        }
        for(int i=1;i<n;i+=2) {
            int a = arr[i];
            map2.put(a, map2.getOrDefault(a, 0) + 1);
        }

        int modeA1 = 0, modeA2 = 0, modeB1 = 0, modeB2 = 0;
        int ans1A = 0, ans1B = 0, ans2A = 0, ans2B = 0;

        for(int i : map1.keySet()) {
            int val = map1.get(i);
            if(val > modeA1) {
                modeA2 = modeA1;
                modeA1 = val;
                ans1A = i;
            }
            else if(val > modeA2) {
                modeA2 = val;
                ans1B = i;
            }
        }
        for(int i : map2.keySet()) {
            int val = map2.get(i);
            if(val > modeB1) {
                modeB2 = modeB1;
                modeB1 = val;
                ans2A = i;
            }
            else if(val > modeB2) {
                modeB2 = val;
                ans2B = i;
            }
        }

        int ans = 0;
        if(ans1A != ans1B) {
            for(int i=0;i<n;i+=2) {
                ans += Math.abs(ans1A - arr[i]);
            }
            for(int i=1;i<n;i+=2) {
                ans += Math.abs(ans2A - arr[i]);
            }
        }
        else {
            for(int i=0;i<n;i+=2) {
                ans += Math.abs(ans1B - arr[i]);
            }
            for(int i=1;i<n;i+=2) {
                ans += Math.abs(ans2B - arr[i]);
            }
        }

        pw.println((ans1A == ans2A && ans2B == ans2B) ? n/2 : ans);
        pw.close();
    }
}