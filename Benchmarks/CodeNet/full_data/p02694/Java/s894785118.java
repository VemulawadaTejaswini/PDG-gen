import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(final String[] args) throws Exception {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
            long N = Long.parseLong(br.readLine());
            long condition = 90000000000000000L;
            long ans = 0;
            long base = 100;
            if (condition < N) {
                N = N / 10000000000000L;
                base = condition / 10000000000000L;
                ans = 3517;
            }
            while (base < N) {
                base = (base * 100 + (base * 1)) / 100;
                ans++;
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