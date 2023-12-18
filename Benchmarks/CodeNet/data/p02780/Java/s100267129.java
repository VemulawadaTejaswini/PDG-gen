import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
        String line = bi.readLine();
        String[] str1 = line.split(" ");
        int N = Integer.parseInt(str1[0]);
        int K = Integer.parseInt(str1[1]);

        String[] str2 = bi.readLine().split(" ");
        double[] p = new double[N];
        HashMap<Integer, Double> exp = new HashMap<>();

        for (int i = 0; i < N; i++){
            int pp = Integer.parseInt(str2[i]);
            if (exp.containsKey(pp) == false) {
                exp.put(pp, (double)(1 + pp) /2);
            }
            for (int j = i; j < i + K ;j++) {
                if (j == N) break;
                p[j] = p[j] + exp.get(pp);
            }
        }
        double max = Arrays.stream(p).max().getAsDouble();
        System.out.println(max);
    }
}