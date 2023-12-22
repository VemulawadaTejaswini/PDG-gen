import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] strings = br.readLine().split(" ");
        int[] ls = new int[strings.length];
        for (int i = 0; i < ls.length; i++) {
            ls[i] = Integer.parseInt(strings[i]);
        }
        System.out.println(problem175b(n, ls));
    }

    private static int problem175b(int n, int[] ls) {
        int count = 0;
        for (int i = 0; i < ls.length - 2; i++) {
            int li = ls[i];
            for (int j = i + 1; j < ls.length - 1; j++) {
                int lj = ls[j];
                for (int k = j + 1; k < ls.length; k++) {
                    int lk = ls[k];
                    if (isDifference(li, lj, lk) && isTriangle(li, lj, lk)) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    private static boolean isDifference(int a, int b, int c) {
        return (a != b && b != c && a != c);
    }

    private static boolean isTriangle(int a, int b, int c) {
        return ((a + b) > c) && ((b + c) > a) && ((c + a) > b);
    }
}