
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        int n = sc.nextInt();

        Integer[] kisu = new Integer[100001];
        Integer[] gusu = new Integer[100001];
        Integer[] subete = new Integer[100001];

        Arrays.fill(kisu, 0);
        Arrays.fill(gusu, 0);
        Arrays.fill(subete, 0);
        for (int i = 0; i < n; i++) {
            int v = sc.nextInt();
            subete[v]++;
            if ((i + 1) % 2 == 0) {
                gusu[v]++;
            } else {
                kisu[v]++;
            }
        }

        int gusuMax = -1;
        int gusuMaxIndex = -1;
        int gusuSecound = -1;
        int gusuSecoundIndex = -1;
        int kisuMax = -1;
        int kisuMaxIndex = -1;
        int kisuSecound = -1;
        int kisuSecoundIndex = -1;

        for (int i = 0; i < gusu.length; i++) {
            if (gusuMax < gusu[i]) {
                gusuMax = gusu[i];
                gusuMaxIndex = i;
            } else if (gusuSecound < gusu[i]) {
                gusuSecound = gusu[i];
                gusuSecoundIndex = i;
            }
            if (kisuMax < kisu[i]) {
                kisuMax = kisu[i];
                kisuMaxIndex = i;
            } else if (kisuSecound < kisu[i]) {
                kisuSecound = kisu[i];
                kisuSecoundIndex = i;
            }
        }

        if (gusuMaxIndex == kisuMaxIndex) {
            if (gusuMax < kisuMax) {
                out.println((n / 2 - kisuMax) + (n / 2 - gusuSecound));
            } else {
                out.println((n / 2 - kisuSecound) + (n / 2 - gusuMax));
            }
        } else {
            out.println((n / 2 - kisuMax) + (n / 2 - gusuMax));
        }

        out.flush();

    }

    static class Toi {
        public int x;
        public int y;

        public Toi(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override public boolean equals(Object obj) {
            if (obj == null) {
                return false;
            }

            if (this == obj) {
                return true;
            }

            if (this.getClass() != obj.getClass()) {
                return false;
            }

            Toi toi = (Toi) obj;
            return x == toi.x && y == toi.y;
        }
    }

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
}