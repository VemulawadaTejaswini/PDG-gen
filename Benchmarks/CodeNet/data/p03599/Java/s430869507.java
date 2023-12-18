
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    private int C;
    private int D;
    private int E;
    private int Max;
    private int Suger;
    private double Density = 0;
    private int F;

    void solve() {
        int A = in.nextInt();
        int B = in.nextInt();
        C = in.nextInt();
        D = in.nextInt();
        E = in.nextInt();
        F = in.nextInt();

        int MaxWater = (100 * F) / (100 + E);
        int B_Count = MaxWater / (100 * B);
        int A_Count = MaxWater / (100 * A);
        for (int i = 0; i <= B_Count; i++) {
            for (int j = 0; j <= A_Count; j++) {
                CheckSuger((B * i + A * j) * 100);
            }
        }
        out.println(Max + " " + Suger);
    }

    void CheckSuger(int Water) {
        int Suger_Max = Water * E / 100;
        int D_Count = Suger_Max / D;
        int C_Count = (Suger_Max % D) / C;
        int Suger_Count = D_Count * D + C_Count * C;
        double temp_density = (double) Suger_Count / (double) (Water + Suger_Count);
        if (temp_density > Density && Water+Suger_Count <= F) {
            Max = Water + Suger_Count;
            Suger = Suger_Count;
        }
    }


    FastScanner in;
    PrintWriter out;

    void run() {
        in = new FastScanner();
        out = new PrintWriter(System.out);
        solve();
        out.close();
    }

    public class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public FastScanner(String s) {
            try {
                br = new BufferedReader(new FileReader(s));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public String nextToken() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(nextToken());
        }

        public long nextLong() {
            return Long.parseLong(nextToken());
        }

        public double nextDouble() {
            return Double.parseDouble(nextToken());
        }
    }

    public static void main(String[] args) {
        new Main().run();
    }

}