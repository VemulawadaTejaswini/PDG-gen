import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

class Main {
    public static void main(final String[] args) throws Exception {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
            List<String> input = Arrays.asList(br.readLine().split(" "));
            int a = Integer.parseInt(input.get(0));
            int b = Integer.parseInt(input.get(1));
            int c = Integer.parseInt(input.get(2));

            int ans = 0;
            
            for (int i = a; i <= b; i++) {
                if (i % c == 0)
                    ans += 1;
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