import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        FastScanner in = new FastScanner();
        
        int n = in.nextInt();
        int m = in.nextInt();
        
        int matrix[][] = new int[n][m];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = in.nextInt() - 1;
            }
        }
        
        int curIndex[] = new int[n];
        int numPlayers[] = new int[m];
        
        
        int best = 301;
        
        for (int i = 0; i < n; i++) numPlayers[matrix[i][0]]++;
        
        for (int i = 0; i < n; i++) {
            int curMax = 0;
            int maxSport = -1;
            for (int j = 0; j < m; j++) {
                if (numPlayers[j] > curMax) {
                    curMax = numPlayers[j];
                    maxSport = j;
                }
            }
            
            if (curMax < best) best = curMax;
            
            numPlayers[maxSport] = -1;
            if (i == n-1) break;
            for (int j = 0; j < m; j++) if (numPlayers[j] != -1) numPlayers[j] = 0;
            
            for (int j = 0; j < n; j++) {
                while (numPlayers[matrix[j][curIndex[j]]] == -1) curIndex[j]++;
                numPlayers[matrix[j][curIndex[j]]]++;
            }
        }
        System.out.println(best);
    }

    public static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(String s) {
            try {
                br = new BufferedReader(new FileReader(s));
            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        public FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String nextToken() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        String nextLine() {
            st = null;
            try {
                return br.readLine();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            return null;
        }

        int nextInt() {
            return Integer.parseInt(nextToken());
        }

        long nextLong() {
            return Long.parseLong(nextToken());
        }

        double nextDouble() {
            return Double.parseDouble(nextToken());
        }
    }
}