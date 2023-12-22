
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
        if(K % 2 == 0 || K % 5 == 0) return -1;
        long k0 = K % 10;
        long a = 0;
        long ans = 0;
        while(true){
            for(int b=0; b<10; b++){
                long c = b * K + a;
                if(c % 10 == 7){
                    a = c / 10;
                    ans++;
                    break;
                }
            }
            if(a == 0) break;
        }
        return ans;
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

