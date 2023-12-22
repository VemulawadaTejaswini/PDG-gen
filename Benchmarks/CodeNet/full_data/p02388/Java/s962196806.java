
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        int num = 0;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String s = br.readLine();
            int x = Integer.parseInt(s);
            System.out.println(x * x * x);
        } catch (NumberFormatException e) {
        } catch (IOException e) {
        }
    }
}