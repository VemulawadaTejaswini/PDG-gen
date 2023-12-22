import java.io.*;

class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n;
        String[] points;
        int[] s;
        int i;
        double m;
        double a;

        while ((n = Integer.parseInt(br.readLine())) != 0) {
            points = br.readLine().split(" ");
            s = new int[n];

            m = 0;
            for (i = 0; i < n; i++) {
                s[i] = Integer.parseInt(points[i]);
                m += s[i];
            }
            m /= n;

            a = 0;
            for (i = 0; i < n; i++) {
                a += Math.pow(s[i] - m, 2);
            }

            System.out.println(Math.sqrt(a / n));
        }

    }
}