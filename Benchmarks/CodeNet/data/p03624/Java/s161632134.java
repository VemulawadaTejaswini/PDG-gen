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
            List<String> inputString = Arrays.asList(br.readLine().split(""));
            Set<String> inputSet = new TreeSet<>();
            for (String str : inputString) {
                inputSet.add(str);
            }
            
            String ans = "None";
            for (int i = 66; i <= 90; i++) {
                String tmpString = String.valueOf((char) i).toLowerCase();
                if (!inputSet.contains(tmpString)) {
                    ans = tmpString;
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