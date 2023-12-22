import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AOJ {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        x *= x *= x;
        System.out.println(x);
    }
}