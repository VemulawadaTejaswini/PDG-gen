import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String... args) {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        try {
            for (int i = 0; i < 200; i++) {
                String[] data = input.readLine().split(" ");
                System.out.println((Integer.parseInt(data[0])+Integer.parseInt(data[1])));
            }
        } catch (IOException e) {
        }
    }
}