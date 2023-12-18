import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] xa = br.readLine().split(" ");
        int x = Integer.parseInt(xa[0]);
        int a = Integer.parseInt(xa[1]);
        System.out.println(problem130a(x, a));
    }

    private static int problem130a(int x, int a) {
        return (x < a) ? 0 : 10;
    }
}