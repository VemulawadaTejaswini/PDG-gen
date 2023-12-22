
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    FastIO io = new FastIO("in.txt");
    long K;

    long check(long a){
        int n7 = 0;
        while(a > 0){
            if(a % 10 != 7) return -1;
            n7++;
            a /= 10;
        }
        return n7;
    }

    long solve(){
        for(int i=1; i<=K*10; i++){
            long a = K * i;
            long n7 = check(a);
            if(n7 > 0) return n7;
        }
        return -1;
    }

    public void main() throws Exception {
        K = io.nextLong();
        io.out(solve() + "\n");
    }

    public static void main(String[] args) throws Exception {
        Main task = new Main();
        task.main();
    }

    class FastIO {
        BufferedReader br;
        StringTokenizer sk;

        public FastIO(String fname){
            try{
                File f = new File(fname);
                if(f.exists()) {
                    System.setIn(new FileInputStream(fname));
                }

            }catch (Exception e){
                throw new IllegalArgumentException(e);
            }

            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public FastIO(){
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next(){
            while(sk==null || !sk.hasMoreElements()){
                try {
                    sk = new StringTokenizer(br.readLine());
                }catch (Exception e){
                    throw new IllegalArgumentException(e);
                }
            }
            return sk.nextToken();
        }

        public int nextInt(){
            return Integer.parseInt(next());
        }

        public char nextChar(){
            return next().charAt(0);
        }

        public long nextLong(){
            return Long.parseLong(next());
        }

        public double nextDouble(){
            return Double.parseDouble(next());
        }

        public String nextLine(){
            String str = "";
            try {
                str = br.readLine();
            }catch (Exception e){
                e.printStackTrace();
            }
            return str;
        }

        public void out(String v){
            System.out.print(v);
        }

        public void out(int v) {
            System.out.print(v);
        }

        public void out(long v){
            System.out.print(v);
        }

        public void out(double v) {
            System.out.print(v);
        }
    }
}

