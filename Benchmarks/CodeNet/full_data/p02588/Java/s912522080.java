import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;


public class Main {
    static int N;

    static Map<Pair, Integer> mp;

    static class Pair{
        public int a, b;
        public Pair(int a, int b){
            this.a = a;
            this.b = b;
        }

        @Override
        public int hashCode() {
            return Integer.hashCode(a) + Integer.hashCode(b);
        }

        @Override
        public boolean equals(Object obj) {
            Pair po = (Pair)obj;
            return po.a == a && po.b == b;
        }
    }

    static FastIO io = new FastIO("in.txt");

    static Pair format(String s){
        int n = s.length();
        int n5 = 0, n2 = 0;
        long a = 0, b = 0;

        if(s.contains(".")){
            int di = s.indexOf('.');
            int i = n - 1;
            while(i >= 0 && s.charAt(i)=='0')i--;

            String sa = s.substring(0, di);
            String sb = s.substring(di+1, i+1);
            a = Long.parseLong(sa);
            if(sb.length() > 0){
                b = Long.parseLong(sb);
            }
            a *= Math.pow(10, sb.length());
            a += b;
            b = sb.length();

        }else{
            a = Long.parseLong(s);
        }

        while(a % 5 == 0){
            n5++;
            a /= 5;
        }

        while(a % 2 == 0){
            n2++;
            a /= 2;
        }

        n5 -= b; n2 -= b;
        return new Pair(n2, n5);
    }

    public static void main(String[] args) throws Exception {
        N = io.nextInt();
        mp = new HashMap<>();
        for(int i=0; i<N; i++){
            String A = io.next();
            Pair p = format(A);
            if(!mp.containsKey(p)){
                mp.put(p, 0);
            }

            mp.put(p, mp.get(p) + 1);
        }

        Pair[] keys = new Pair[mp.size()];
        mp.keySet().toArray(keys);

        long ans = 0;
        for(int i=0; i<keys.length; i++){
            int ni = mp.get(keys[i]);
            Pair ki = keys[i];
            if(ki.a >= 0 && ki.b >= 0){
                ans += ni * (ni - 1) / 2;
            }
            for(int j=i+1; j<keys.length; j++){
                int nj = mp.get(keys[j]);
                Pair kj = keys[j];

                if(ki.a + kj.a >= 0 && ki.b + kj.b >= 0){
                    ans += ni * nj;
                }
            }
        }

        io.println(ans);

        io.close();
    }



    static class FastIO {
        BufferedReader br;
        StringTokenizer sk;
        PrintWriter pw = new PrintWriter(System.out);

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

        public void print(Object o){
            pw.print(o);
        }

        public void println(Object o){
            pw.println(o);
        }

        public void close(){
            pw.close();
        }

        public void flush(){
            pw.flush();
        }
    }
}

