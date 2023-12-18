import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String[] array = reader.readLine().split(" ");
            int N = Integer.parseInt(array[0]);
            int D = Integer.parseInt(array[1]);

            int ret = N / (D * 2 + 1);
            if (N % (D * 2 + 1) != 0) {
                ret++;
            }

            System.out.println(ret);
        }
    }

}
