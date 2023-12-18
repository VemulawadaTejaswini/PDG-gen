import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws Exception {

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int firstRectangleHeight = Integer.parseInt(br.readLine());
            int firstRectangleWidth = Integer.parseInt(br.readLine());
            int secondRectangleHeight = Integer.parseInt(br.readLine());
            int secondRectangleWidth = Integer.parseInt(br.readLine());

            int areaOfAFirstRectangle = firstRectangleHeight * firstRectangleWidth;
            int areaOfASecondRectangle = secondRectangleHeight * secondRectangleWidth;

            if (areaOfAFirstRectangle >= areaOfASecondRectangle) {
                System.out.println(areaOfAFirstRectangle);
            } else {
                System.out.println(areaOfASecondRectangle);
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