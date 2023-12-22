import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static final int LAST_NUM = 600;

    public static void main(String[] args) {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String input = null;

        try {
            while ((input = in.readLine()) != null) {
                int step = Integer.valueOf(input);
                int large = 0;

                for (int i = step; i < LAST_NUM; i += step) {
                    large += step * i * i;
                }

                System.out.println(large);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}