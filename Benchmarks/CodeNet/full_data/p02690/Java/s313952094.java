import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    private static ArrayList<Long> cubes;
    public static void main(String[] args) {
        FastReader reader = new FastReader();
        BufferedWriter log = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            cubes = new ArrayList<>();
            preComputation();
            long x = reader.nextLong();

            long a = 0, b = 0;

            for (int i = 0; i < cubes.size(); i++) {
                long cube = cubes.get(i);
                long first = cube - x;
                int index = Collections.binarySearch(cubes, first);
                if (index >= 0) {
                    a = i - 5000;
                    b = index - 5000;
                    break;
                }

                long second = cube + x;
                index = Collections.binarySearch(cubes, second);
                if (index >= 0) {
                    a = i - 5000;
                    b = index - 5000;
                    break;
                }
            }

            log.write(a + " " + b + "\n");
            log.flush();
            log.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void preComputation() {
        for (int i = -5000; i <= 5000; i++) {
            cubes.add((long) i * (long) i * (long) i * (long) i * (long) i);
        }
    }
}
class FastReader {
    BufferedReader br;
    StringTokenizer st;

    public FastReader() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    public String next() {
        while (st == null || !st.hasMoreElements()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    public String nextLine() {
        String str = "";
        try {
            str = br.readLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return str;
    }
}