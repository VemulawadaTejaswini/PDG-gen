import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws Exception {

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int peopleCount = Integer.parseInt(br.readLine());
            int groupCount = 0;
            while (peopleCount >= 3) {
                peopleCount -= 3;
                groupCount += 1;
            }

            System.out.println(groupCount);
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            System.exit(0);
        } catch (final Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }
}