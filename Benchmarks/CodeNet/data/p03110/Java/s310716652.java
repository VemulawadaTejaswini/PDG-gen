
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        double[] value = new double[N];
        String[] type = new String[N];
        for (int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            value[i] = Double.parseDouble(st.nextToken());
            type[i] = st.nextToken();
        }
        double out = 0;
        for (int i=0; i<N; i++) {
            if (type[i].equals("JPY")) {
                out += value[i];
            } else {
                out += value[i]*380000;
            }
        }
        System.out.println(out);
    }
}
