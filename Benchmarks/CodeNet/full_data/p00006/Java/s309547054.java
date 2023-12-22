import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String input = null;

        try {
            while ((input = in.readLine()) != null) {

                char[] inputChar = input.toCharArray();

                StringBuffer result = new StringBuffer();

                for (int i = inputChar.length - 1; i >= 0; i--) {
                    result.append(inputChar[i]);
                }

                System.out.println(result.toString());
            }
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