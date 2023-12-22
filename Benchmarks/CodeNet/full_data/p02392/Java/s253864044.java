import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
            new BufferedReader(new InputStreamReader(System.in));

        String[] line = reader.readLine().split(" ");
        int inputA = Integer.parseInt(line[0]);
        int inputB = Integer.parseInt(line[1]);
        int inputC = Integer.parseInt(line[2]);

        if ((inputA >= inputB) || (inputB >= inputC)) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}