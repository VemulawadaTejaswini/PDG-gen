import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException{
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            label:
            while (true) {
                String[] sArr = br.readLine().split(" ");
                int a = Integer.parseInt(sArr[0]);
                int b = Integer.parseInt(sArr[2]);
                String op = sArr[1];

                int res;

                switch (op) {
                    case "+":
                        res = a + b;
                        break;
                    case "-":
                        res = a - b;
                        break;
                    case "*":
                        res = a * b;
                        break;
                    case "/":
                        res = a / b;
                        break;
                    case "?":
                        break label;
                    default:
                        throw new RuntimeException();
                }

                System.out.println(res);
            }

        }
    }
}

