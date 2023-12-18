import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class Main {
    public static void main(final String[] args) throws Exception {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
            int N = Integer.parseInt(br.readLine());

            long[] lucasTmp = {2, 1};

            for (int i = 2; i < N; i++) {
                long tmp = lucasTmp[0] + lucasTmp[1];
                lucasTmp[0] = lucasTmp[1];
                lucasTmp[1] = tmp;
            }


            long ans = 0;
            if (N == 0) {
                ans = lucasTmp[0];
            } else if (N == 1) {
                ans = lucasTmp[1];
            } else {
                ans = lucasTmp[0] + lucasTmp[1];
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