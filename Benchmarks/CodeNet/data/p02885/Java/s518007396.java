import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            args = reader.readLine().split(" ");
            int A = Integer.parseInt(args[0]);
            int B = Integer.parseInt(args[1]);

            int ans = Math.max(A - B * 2, 0);

            System.out.println(ans);
        }
    }

}
