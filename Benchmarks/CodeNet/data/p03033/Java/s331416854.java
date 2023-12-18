import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] in = br.readLine().split(" ");
        int n = Integer.parseInt(in[0]);
        int q = Integer.parseInt(in[1]);
        int[] s = new int[n];
        int[] t = new int[n];
        int[] x = new int[n];
        for(int i = 0; i < n; i++) {
            in = br.readLine().split(" ");
            s[i] = Integer.parseInt(in[0]);
            t[i] = Integer.parseInt(in[1]);
            x[i] = Integer.parseInt(in[2]);
        }

        for(int i = 0; i < q; i++) {
            int d = Integer.parseInt(br.readLine());
            int ans = 2000000000;
            for(int j = 0; j < n; j++) {
                int time = d + x[j];
                if(s[j] <= time && time < t[j]) ans = Math.min(ans, x[j]);
            }
            System.out.println(ans == 2000000000? -1 : ans);
        }
    }
}