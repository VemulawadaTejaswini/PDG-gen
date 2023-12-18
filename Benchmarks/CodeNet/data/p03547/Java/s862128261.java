import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        String[] inputs = reader.readLine().split(" ");
        char X = inputs[0].charAt(0);
        char Y = inputs[1].charAt(0);
        if (X == Y) {
            System.out.println("==");
        } else if (X < Y) {
            System.out.println("<");
        } else {
            System.out.println(">");
        }
    }
}