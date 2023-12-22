import java.io.*;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String line = reader.readLine();
            String[] length = line.split(" ", -1);
            int a = Integer.parseInt(length[0]);
            int b = Integer.parseInt(length[1]);
            int x = a * b;
            int y = (a + b) * 2;
            System.out.println(x + " " + y);
        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println("error");
        }
    }
}