import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(final String[] args) throws Exception {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
            int count = Integer.parseInt(br.readLine().split(" ")[0]);
            List<String> inputStringList = new ArrayList<>();
            for (int i = 0; i < count; i++) {
                inputStringList.add(br.readLine());
            }

            for (int i = 0; i < count; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.println(inputStringList.get(i));
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