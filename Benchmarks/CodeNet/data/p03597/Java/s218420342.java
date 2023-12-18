import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws Exception {

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int cellsCount = (int) Math.pow(Double.parseDouble(br.readLine()), 2);
            int blackCellsCount = cellsCount - Integer.parseInt(br.readLine());

            System.out.println(blackCellsCount);

        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            System.exit(0);
        } catch (final Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }
}