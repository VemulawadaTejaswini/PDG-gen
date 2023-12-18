import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws Exception {

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String[] inputCookiesCount = br.readLine().split(" ");

            int cookiesCount = 0;
            for (int i = 0; i < inputCookiesCount.length; i++) {
                cookiesCount += Integer.parseInt(inputCookiesCount[i]);
            }

            String sharingIs = "Impossible";

            if (cookiesCount % 3 == 0) {
                sharingIs = "Possible";
            }

            System.out.println(sharingIs);

        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            System.exit(0);
        } catch (final Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }
}