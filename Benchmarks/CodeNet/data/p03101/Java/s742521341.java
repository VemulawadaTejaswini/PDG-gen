import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws Exception {

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String[] a = br.readLine().split(" ");
            String[] b = br.readLine().split(" ");

            int c = Integer.parseInt(a[0]);
            int d = Integer.parseInt(a[1]);
            int e = Integer.parseInt(b[0]);
            int f = Integer.parseInt(b[1]);

            System.out.println((c- e) * (d - f));
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            System.exit(0);
        } catch (final Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }
}