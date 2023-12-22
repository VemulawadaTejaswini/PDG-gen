import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = br.readLine().split(" ");
        int[] xs = new int[strings.length];
        for (int i = 0; i < xs.length; i++) {
            xs[i] = Integer.parseInt(strings[i]);
        }
        System.out.println(problem170a(xs));
    }

    private static int problem170a(int[] xs) {
        for (int i = 0; i < xs.length; i++) {
            if (xs[i] == 0) return (i + 1);
        }
        return 0;
    }
}