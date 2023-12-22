import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.NavigableMap;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

    public static class BIT {
        int[] dat;

        public BIT(int n){
            dat = new int[n + 1];
        }

        public void add(int k, int a){ // k : 0-indexed
            for(int i = k + 1; i < dat.length; i += i & -i){
                dat[i] += a;
            }
        }

        public int sum(int s, int t){ // [s, t)
            if(s > 0) return sum(0, t) - sum(0, s);

            int ret = 0;
            for(int i = t; i > 0; i -= i & -i) {
                ret += dat[i];
            }
            return ret;
        }

        public int get(int k){ // k : 0-indexed
            int p = Integer.highestOneBit(dat.length - 1);
            for(int q = p; q > 0; q >>= 1, p |= q){
                if( p >= dat.length || k < dat[p]) p ^= q;
                else k -= dat[p];
            }
            return p;
        }
    }

    public static class Data implements Comparable<Data> {
        private int data, index;

        public Data(int data, int index){
            this.data = data;
            this.index = index;
        }

        @Override public int compareTo(Data arg0){
            if(Integer.compare(this.data, arg0.data) != 0){
                return Integer.compare(this.data, arg0.data); // 小さい方を先にする
            }else{
                return Integer.compare(arg0.index, this.index); // 同じ値なら後ろの方を先にする
            }
        }
    }

	public static void main(String[] args){
        try(final Scanner sc = new Scanner(System.in)) {
            final int N = sc.nextInt();

            final int[] arr = new int[N];
            for(int i = 0; i < N; i++){
                arr[i] = sc.nextInt();
            }

            BIT bit_for_query = new BIT(N);

            // クエリに答えるための転倒数を計算する
            {
                BIT bit_for_prepare = new BIT(N);
                PriorityQueue<Data> queue = new PriorityQueue<Data>();
                for(int index = 0; index < N; index++){
                    queue.add(new Data(arr[index], index));
                }

                while(!queue.isEmpty()){
                    final Data data = queue.poll();
                    final int value = data.data;
                    final int index = data.index;

                    bit_for_query.add(index, bit_for_prepare.sum(index + 1, N));
                    bit_for_prepare.add(index, 1);
                }
            }

            final int Q = sc.nextInt();
            for(int q = 0; q < Q; q++){
                final int l = sc.nextInt() - 1;
                final int r = sc.nextInt() - 1; // [l, r]

                System.out.println(bit_for_query.sum(l, r));
            }
        }
	}

    public static class Scanner implements AutoCloseable {
        private BufferedReader br;
        private StringTokenizer tok;

        public Scanner(InputStream is) {
            br = new BufferedReader(new InputStreamReader(is));
        }

        private void getLine() {
            try {
                while (!hasNext()) {tok = new StringTokenizer(br.readLine());}
            } catch(IOException e){ /* ignore */ }
        }

        private boolean hasNext() {
            return tok != null && tok.hasMoreTokens();
        }

        public String next() {
            getLine(); return tok.nextToken();
        }

        public int nextInt(){
            return Integer.parseInt(next());
        }
        // 他のnextXXXもXXX.parseXXX()メソッドを使って作れるので省略

        public void close() {
            try{ br.close(); } catch (IOException e){ /*ignore*/ }
        }
    }
}