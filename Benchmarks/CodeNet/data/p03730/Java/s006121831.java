import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Main {
    public static void main(final String[] args) throws Exception {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
            List<String> inputString = Arrays.asList(br.readLine().split(" "));

            int A = Integer.parseInt(inputString.get(0));
            int B = Integer.parseInt(inputString.get(1));
            int C = Integer.parseInt(inputString.get(2));

            String ans = "NO";
            if (A % 2 == 0 && B % 2 == 0 && C % 2 == 0) {
                ans = "YES";
            } else if (A % 2 != 0 && B % 2 != 0 && C % 2 != 0) {
                ans = "YES";
            } else if (A % 2 != 0 && B % 2 == 0 && C % 2 != 0) {
                ans = "YES";
            } else if (A % 2 == 0 && B % 2 != 0 && C % 2 != 0) {
                ans = "YES";
            } else if (A % 2 != 0 && B % 2 != 0 && C % 2 == 0) {
                ans = "YES";
            }

            System.out.println(ans);
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            System.exit(0);
        } catch (final Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }
}