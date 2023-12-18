import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws Exception {

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String base = br.readLine();
            String pairBase = "T";

            switch (base) {
                case "T":
                    pairBase = "A";
                    break;
                case "C":
                    pairBase = "G";
                    break;
                case "G":
                    pairBase = "C";
                    break;
            }

            System.out.println(pairBase);
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            System.exit(0);
        } catch (final Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }
}