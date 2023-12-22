
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        int a, b;
        String op;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();

        while (true) {
            String data = reader.readLine();
            String[] number = data.split(" ");
            a = Integer.parseInt(number[0]);
            op = number[1];
            b = Integer.parseInt(number[2]);

            if (op.equals("?")) {
                break;
            }
            if (op.equals("+")) {
                 builder
                    .append(a+b)
                    .append("\n");
            }
            if (op.equals("-")) {
                 builder
                    .append(a-b)
                    .append("\n");
            }
            if (op.equals("*")) {
                 builder
                    .append(a*b)
                    .append("\n");
            }
            if (op.equals("/")) {
                 builder
                    .append(a/b)
                    .append("\n");
            }
        }
        System.out.print(builder);        
    }
}