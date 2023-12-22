import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int ii = 0; ii < n; ii++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            double[] data = new double[8];
            for (int i = 0; i < 8; i++) {
                data[i] = Double.parseDouble(st.nextToken());
            }
            double x1 = data[2] - data[0];
            double y1 = data[3] - data[1];
            double x2 = data[6] - data[4];
            double y2 = data[7] - data[5];
            double h1 = Math.sqrt(x1 * x1 + y1 * y1);
            double h2 = Math.sqrt(x2 * x2 + y2 * y2);
            double deg = Math.toDegrees(Math.acos((x1 * x2 + y2 * y1) / (h1 * h2)));
            System.out.println(((Math.round(deg) == 0)||(Math.round(deg)==180)) ? "YES" : "NO");
        }
    }
}