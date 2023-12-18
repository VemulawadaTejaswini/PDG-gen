import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] ab = br.readLine().split(" ");
        int a = Integer.parseInt(ab[0]);
        int b = Integer.parseInt(ab[1]);
        System.out.println(problem144a(a, b));
    }

    private static int problem144a(int a, int b) {
        return (isValid(a) && isValid(b)) ? (a * b) : -1;
    }

    private static boolean isValid(int n) {
        return (1 <= n) && (n <= 9);
    }
}