import java.util.*;
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader;

public class Main {

    static class IO {
        BufferedReader br;
        StringTokenizer st;

        public IO() {
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

        int[] readarray(int sz) {
            int[] ret = new int[sz];
            for (int i = 0; i < sz; i++)
                ret[i] = nextInt();
            return ret;
        }
    }

    public static void main(String[] args) {
        IO fs = new IO();
        int n = fs.nextInt();
        int[] h = fs.readarray(n);
        int op = 0;
        while(true){
            SortedSet<Integer> st = new TreeSet<Integer>();
            //System.out.println(1);
            int prev = 0;
            for(int i = 0; i<n; i++){
                if(i == n-1){
                    st.add(h[i]);
                    while(!st.isEmpty() && st.first() == 0){
                        st.remove(st.first());
                    }
                    if(!st.isEmpty()){
                        int minval = ((TreeSet<Integer>) st).first();
                        //System.out.println(minval);
                        op+=minval;
                        for(int j = prev; j<=i; j++){
                            if(h[j]!=0)h[j] -= minval;
                        }
                        st.clear();
                    }
                    prev = i+1;
                }
                else if(h[i] == 0 && !st.isEmpty()){
                    while(!st.isEmpty() && st.first() == 0){
                        st.remove(st.first());
                    }
                    if(!st.isEmpty()){
                        int minval = ((TreeSet<Integer>) st).first();
                        //System.out.println(minval);
                        op+=minval;
                        for(int j = prev; j<=i; j++){
                            if(h[j]!=0)h[j] -= minval;
                        }
                        st.clear();
                    }
                    prev = i+1;
                }
                else if(h[i] == 0 && st.isEmpty())prev+=1;
                else if(!st.contains(h[i]) && h[i] != 0) st.add(h[i]);
                else continue;
            }
            boolean ok = true;
            for(int i = 0; i<n; i++){
                if(h[i]>0)ok = false;
            }
            if(ok)break;
        }
        System.out.println(op);
    }

    public static boolean check(int [] h,int n){
        for(int i = 0; i<n; i++){
            if(h[i]>0)return false;
        }
        return true;
    }
}
