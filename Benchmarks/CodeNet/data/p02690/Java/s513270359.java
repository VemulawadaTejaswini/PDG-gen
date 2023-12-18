import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        FastReader s = new FastReader();
        long x = s.nextLong();
        ArrayList<Long> arr = new ArrayList<Long>();
        HashMap<Long,Long> map=new HashMap<>();
        for(long i=-4000;i<4000;i++)
            map.put(i,(long) Math.pow(i,5));
        for(long i=-4000;i<4000;i++){
            if(map.containsValue(map.get(i)-x)){
                long pos=0;
                for(long j=-4000;j<4000;j++){
                    if(map.get(j)==((map.get(i)-x))){
                        pos=j;
                        break;
                    }
                }
                System.out.println(i+" "+pos);
                break;
            }
        }

    }

    private static boolean isPrime(int n) {
        if (n == 2)
            return true;
        else if ((n % 2 == 0 && n > 2) || n < 2)
            return false;
        else {
            for (int i = 3; i <= (int) Math.sqrt(n); i += 2) {
                if (n % i == 0)
                    return false;
            }
            return true;
        }


    }

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

}