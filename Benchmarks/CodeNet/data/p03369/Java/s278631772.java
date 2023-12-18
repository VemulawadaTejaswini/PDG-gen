import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        String input = br.readLine().toLowerCase();
        if (input.length() == 3) {
            if (input.matches("[ox]*")) {
                long count = input.chars().filter(ch -> ch == 'o').count();
                long price = 700;
                if (count > 0)
                    System.out.println(price + 100 * count);
                else
                  System.out.println(price);
            } else {
                System.out.println("Error!");
            }

        } else {
            System.out.println("Error!");
        }
    }
}