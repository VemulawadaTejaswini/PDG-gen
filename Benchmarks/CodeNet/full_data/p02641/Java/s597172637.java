
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
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
    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int x = fr.nextInt();
        int n = fr.nextInt();
        if(n==0){
            System.out.println(x);
        }
        else{
            Set<Integer> set = new HashSet<>();
            for (int i = 0; i < n; i++) {
                set.add(fr.nextInt());
            }
            if(!set.contains(x)){
                System.out.println(x);
            }
            else{
                int forward = x+1;
                while(set.contains(forward)){
                    forward++;
                }
                int backward = x-1;
                while(set.contains(backward)){
                    backward--;
                }
                int val1 = forward-x;
                int val2 = 0;
                if(backward<0){
                    val2+=(x);
                    val2+=(Math.abs(backward));
                }
                else{
                    val2=(x-backward);
                }
                if(val1<val2){
                    System.out.println(x+val1);
                }
                else{
                    System.out.println(x-val2);
                }
            }
        }
    }
}