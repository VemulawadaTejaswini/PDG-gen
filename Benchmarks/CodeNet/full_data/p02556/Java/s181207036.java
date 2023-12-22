import java.util.*;
import java.io.*;

public class Main {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception{
        new Main().run();
    }
    void run() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][2];
        for (int i=0; i<n; i++) {
            String[] s = br.readLine().split(" ");
            arr[i][0] = Integer.parseInt(s[0]);
            arr[i][1] = Integer.parseInt(s[1]);
        }

        int[] z = new int[n];
        for (int i=0; i<n; i++) z[i] = arr[i][0] + arr[i][1];
        int[] w = new int[n];
        for (int i=0; i<n; i++) w[i] = arr[i][0] - arr[i][1];

        Arrays.sort(z);
        Arrays.sort(w);

        System.out.print(Math.max(z[n-1]-z[0], w[n-1]-w[0]));
    }
}

