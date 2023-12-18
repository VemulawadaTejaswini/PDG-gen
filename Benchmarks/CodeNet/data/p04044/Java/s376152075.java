import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main {
    public static void main(final String[] args) throws Exception {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
            int count = Integer.parseInt(Arrays.asList(br.readLine().split(" ")).get(0));
            String[] strList = new String[count];
            for (int i = 0; i < count; i++) {
                strList[i] = br.readLine();
            }

            Arrays.sort(strList);
            for (int i = 0; i < count; i++) {
                if (i == count - 1) {
                    System.out.println(strList[i]);
                } else {
                    System.out.print(strList[i]);
                }
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            System.exit(0);
        } catch (final Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }
}