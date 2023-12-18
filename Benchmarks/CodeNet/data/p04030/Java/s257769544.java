import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

class Main {
    public static void main(final String[] args) throws Exception {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
            List<String> input = Arrays.asList(br.readLine().split(""));
            
            String ans = "";
            for (int i = 0; i < input.size() - 1; i++) {
                if (!input.get(i).equals("B") && !input.get(i + 1).equals("B")) {
                    ans += input.get(i);
                }

                if (i + 1 == (input.size() - 1) && !input.get(i + 1).equals("B")) { 
                    ans += input.get(i + 1);
                }
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