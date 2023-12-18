import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Main {

    public static void main(String[] args) throws Exception {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
            int K = Integer.parseInt(br.readLine());
            List<String> inputString = Arrays.asList(br.readLine().split(" "));
            List<Integer> numbers = new ArrayList<>();
            for (String str : inputString) {
                numbers.add(Integer.parseInt(str));
            }
            
            String ans = "NG";
            int start = numbers.get(0);
            int end = numbers.get(1);
            for (int i = start; i <= end; i++) {
                if (i % K == 0) {
                    ans = "OK";
                    break;
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