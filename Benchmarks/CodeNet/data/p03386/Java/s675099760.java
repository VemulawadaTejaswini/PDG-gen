import java.io.IOException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in))) {
            final String s = reader.readLine();

            final String[] sl = s.split(" ");
            int A = Integer.parseInt(sl[0]);
            int B = Integer.parseInt(sl[1]);
            int K = Integer.parseInt(sl[2]);

            K = Math.min(B - A + 1, K);

            TreeSet<Integer> ts = new TreeSet<Integer>();

            for (int i = A; i < A + K; i++) ts.add(i);

            for (int i = B - K + 1; i < B + 1; i++) ts.add(i);

            for (int i : ts) System.out.println(i);
        }
    }
}
