import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] tokens = line.split(" ");
                int result = Integer.parseInt(tokens[1]) / Integer.parseInt(tokens[0]);
                System.out.println(result < Integer.parseInt(tokens[2]) ? result : Integer.parseInt(tokens[2]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
