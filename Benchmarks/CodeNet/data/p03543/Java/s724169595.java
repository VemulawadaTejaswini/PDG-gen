import java.io.IOException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in))) {
            final String s = reader.readLine();

            HashMap<Integer, Integer> m = new HashMap<>();

            for (int i = 0; i < s.length(); i++) {
                int k = s.charAt(i);
                if (m.containsKey(k)) {
                    m.put(k, m.get(k) + 1);
                } else {
                    m.put(k, 1);
                }
            }

            Boolean flg = false;
            for (int ky : m.keySet())
                if (3 <= m.get(ky)) flg = true;

            System.out.println(flg ? "Yes" : "No");
        }
    }
}
