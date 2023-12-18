import java.io.*;

public class Main {
    public static void main(String[] args) {
        int N;
        int M;
        int[] am;
        int[] bm;
        int[][] cibi;

        try (InputScanner is = new InputScanner(System.in)) {
            N = is.ni();
            M = is.ni();
            am = new int[M];
            bm = new int[M];
            cibi = new int[M][];
            for(int i =0;i < M;i++){
                am[i] = is.ni();
                bm[i] = is.ni();
                cibi[i] = is.nia(bm[i]);
            }
        }


        long dp[] = new long[1 << N];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = 1000000009;
        }
        dp[0] =0;
        //鍵 1→Mまで
        for(int i=1;i<=M;i++){
            //i番目を使って移動する集合
            int set = 0;
            for(int j = 0;j < cibi[i-1].length;j++){
                set = set | (1 << (cibi[i-1][j] -1));
            }
            for(int s = 0;s < (1<<N);s++){
                if(dp[s|set] > dp[s]+am[i-1]){
                    dp[s|set] =dp[s]+am[i-1];
                }
            }

        }
        if(dp[(1 << N)-1] == 1000000009){
            dp[(1 << N)-1] = -1;
        }

        System.out.println(dp[(1 << N)-1]);

    }

    public static class InputScanner implements Closeable {
        private final BufferedReader br;
        private String[] element;
        private int elementIndex;

        public InputScanner(InputStream is){
            this.br =  new BufferedReader(new InputStreamReader(is));
        }

        public String next() {
            return this.nextElement();
        }
        //next int
        public int ni(){
            return Integer.parseInt(this.nextElement());
        }
        //next long
        public long li(){
            return Long.parseLong(this.nextElement());
        }
        //next int array
        public int[] nia(int n){
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = this.ni();
            }
            return arr;
        }

        private void readLine() {
            try {
                this.element = this.br.readLine().split("\\s");
            } catch (IOException e) {
                e.printStackTrace();
            }
            this.elementIndex = 0;
        }

        private String nextElement() {
            if(!hasElement()){
                this.readLine();
            }
            return this.element[this.elementIndex++];
        }

        private boolean hasElement() {
            return this.element != null && this.element.length > this.elementIndex;
        }

        @Override
        public void close() {
            if (this.br != null){
                try {
                    this.br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
