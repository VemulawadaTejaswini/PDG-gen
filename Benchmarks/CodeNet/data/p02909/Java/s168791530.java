
import java.io.*;
import java.nio.file.LinkOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main implements Runnable {




    public long ans(long a , long b){
        return Math.min((a+b)/3,Math.min(a,b));
    }


    static int longSubarrWthSumDivByK(Long arr[],
                                      int n, int k)
    {

        HashMap<Integer, Integer> um= new HashMap<Integer, Integer>();


        int[] mod_arr = new int[n];
        int max = 0;
        int curr_sum = 0;


        for (int i = 0; i < n; i++)
        {
            curr_sum += arr[i];
            mod_arr[i] = ((curr_sum % k) + k) % k;
        }

        for (int i = 0; i < n; i++)
        {

            if (mod_arr[i] != 0)
                max = i + 1;

            else if (um.containsKey(mod_arr[i]))
                um.put(mod_arr[i] , i);

            else
                if (max < (i - um.get(mod_arr[i])))
                    max = i - um.get(mod_arr[i]);
        }

        return max;
    }


    MyScanner sc = new MyScanner();
    public void solve() throws Exception {
        out = new PrintWriter(new BufferedOutputStream(System.out));
        String s = sc.next();
        if (s.equals("Sunny")){
            out.println("Cloudy");
        }else if(s.equals("Rainy")){
            out.println("Sunny");
        }else if(s.equals("Cloudy")){
            out.println("Rainy");
        }
    }









//////////////main function...................................................................//
    public static PrintWriter out;
    ////....\\\\
    public static void main(String[] args) throws Exception {
        new Thread(null, new Main(), "", 1 << 26).start();
    }
////My Scanner Function............................................................................//
    public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;

        public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }


        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        boolean hasNextInt() {
            return true;
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

    }
///thread run.................................................////
    public void run() {
        try {
            solve();
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        } finally {
            out.close();
        }
    }
}