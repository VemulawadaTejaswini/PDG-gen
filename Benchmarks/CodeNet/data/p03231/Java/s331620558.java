import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String[] line = br.readLine().split(" ");
        int N = Integer.parseInt(line[0]);
        int M = Integer.parseInt(line[1]);
        String[] S = br.readLine().split("");
        String[] T = br.readLine().split("");

        int lcm = lcm(N, M);
        int res = lcm;
        Set<Integer> setN = new HashSet<>();
        Set<Integer> setM = new HashSet<>();
        int n = lcm / N;
        int m = lcm / M;

        for (int i = 0; i < N; i++) {
            setN.add(n * i + 1);
        }
        for (int i = 0; i < M; i++) {
            setM.add(m * i + 1);
        }
        for (int i = 1; i <= lcm; i++) {
            if (setN.contains(i) && setM.contains(i)) {
                if (!S[(i - 1) / n].equals(T[(i - 1) / m])) {
                    res = - 1;
                    break;
                }
            }
        }
        out.println(res);
        out.close();
    }

    private static int lcm(int m, int n) {
        return m * n / gcd(m, n);    
    }

    private static int gcd(int m, int n) {
        if (m < n) {
            return gcd(n, m);
        }
        if (n == 0) {
            return m;
        }
        return gcd(n, m % n);
    }
}
