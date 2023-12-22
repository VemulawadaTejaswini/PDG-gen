
 import java.lang.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

 class Codechef {
    static List<Integer> al = new ArrayList<>();
    static int[] a;

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
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

    
     
    public static void main(String[] args)throws java.lang.Exception {
        FastReader sc = new FastReader();
        // StringBuffer sb = new StringBuffer();
        //  ArrayList<ArrayList<Integer>> al=new ArrayList<>();

        int x=sc.nextInt();
        
        if(x>=0)
        System.out.println(1);
        else
        System.out.println(0);
        

            
    
    }



}