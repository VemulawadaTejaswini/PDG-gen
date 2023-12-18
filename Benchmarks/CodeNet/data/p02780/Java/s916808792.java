import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
        String line = bi.readLine();
        String[] str1 = line.split(" ");
        int N = Integer.parseInt(str1[0]);
        int K = Integer.parseInt(str1[1]);

        String[] str2 = bi.readLine().split(" ");

        HashMap<Integer, Double> exp = new HashMap<>();
        double p = 0;
        double result = 0;
        for (int i = 0; i < N; i++){
            int pp = Integer.parseInt(str2[i]);
            if (exp.containsKey(pp) == false) {
                exp.put(pp, (double)(1 + pp) /2);
            }
            p += exp.get(pp);
            if (i >= K) {
                p -= exp.get(Integer.parseInt(str2[i - K]));
            }
            if (result < p) {
                result = p;
            }
        }
        System.out.println(result);
    }
}