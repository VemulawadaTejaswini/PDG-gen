import java.io.*;

import static java.lang.Integer.*;
import static java.lang.Double.*;

public class Main {

    public static void main(String[] args) throws IOException {
        PrintWriter prnt = new PrintWriter(System.out);
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int n = parseInt(read.readLine());
        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            arr[i] = parseDouble(read.readLine());
        }
        int res = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                double temp = (arr[i] * arr[j]);
                int temp2 = (int) (arr[i] * arr[j]);
                if (arr[i] != arr[j]) {
                    if (Double.parseDouble(String.valueOf(temp2)) == temp) {
                        res++;
                    }
                }
            }
        }
        prnt.println(res);
        prnt.close();
    }
}