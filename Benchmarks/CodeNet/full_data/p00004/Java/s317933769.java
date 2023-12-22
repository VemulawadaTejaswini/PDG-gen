import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {

        double x[] = new double[2];
        double y[] = new double[2];


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String strs[] = new String[2];

        strs[0] = br.readLine();
        strs[1] = br.readLine();

        for (int j = 0; j <= 1; j++) {
            String numbers[] = strs[j].split(" ");
            int number[] = new int[numbers.length];

            for (int i = 0; i < numbers.length; i++) {
                number[i] = Integer.parseInt(numbers[i]);
            }

            int a = number[0];
            int b = number[1];
            int c = number[2];
            int d = number[3];
            int e = number[4];
            int f = number[5];

            x[j] = (c * e - b * f) / (a * e - b * d);
            y[j] = (c * d - a * f) / (b * d - a * e);

        }
        for (int j = 0; j <= 1; j++) {
            //System.out.println(x[j] + " " + y[j]);
            System.out.printf("%4f",x[j]);
            System.out.print(" ");
            System.out.printf("%4f",y[j]);
            System.out.println("");
        }
    }

}