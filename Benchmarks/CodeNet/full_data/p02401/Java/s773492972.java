import static java.lang.System.*;

import java.io.*;

class Main {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            while (true) {
                String[] line = reader.readLine().split(" ");
                int a = Integer.parseInt(line[0]);
                String op = line[1];
                int b = Integer.parseInt(line[2]);
                
                if (op.equals("?")) {
                    break;
                }

                switch (op) {
                case "+":
                    out.println(a + b);
                    break;

                case "-":
                    out.println(a - b);
                    break;

                case "*":
                    out.println(a * b);
                    break;

                case "/":
                    out.println(a / b);
                    break;

                default:
                    break;
                }
            } 
        } catch (NumberFormatException e) {
            out.println(e);
        } catch (IOException e) {
            out.println(e);
        }

    }

}