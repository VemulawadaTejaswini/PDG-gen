import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws Exception {

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String[] counts = br.readLine().split(" ");
            int catsCount = Integer.parseInt(counts[0]);
            int catsOrDogsCount = Integer.parseInt(counts[1]);
            int hopeCatsCount = Integer.parseInt(counts[2]);

            String isCatsCountPossible = "NO";
            if (catsCount == hopeCatsCount
                    || (catsCount < hopeCatsCount && hopeCatsCount - catsCount <= catsOrDogsCount)) {
                isCatsCountPossible = "YES";
            }

            System.out.println(isCatsCountPossible);
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            System.exit(0);
        } catch (final Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }
}