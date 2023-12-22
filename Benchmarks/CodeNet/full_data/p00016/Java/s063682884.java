import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static final String REGIX_COMMA = ",";
    private static final int MAX_ANGLE = 180;
    private static final String EOF = "0,0";

    public static void main(String[] args) {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            String input = null;

            double x = 0;
            double y = 0;
            int angle = 90;

            while ((input = in.readLine()) != null && !EOF.equals(input)) {

                String[] data = input.split(REGIX_COMMA);
                int length = Integer.valueOf(data[0]);

                x += length * Math.cos(Math.toRadians(Integer.valueOf(angle)));
                y += length * Math.sin(Math.toRadians(Integer.valueOf(angle)));
                angle -= Integer.valueOf(data[1]);
            }

            System.out.println((int)x);
            System.out.println((int)y);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}