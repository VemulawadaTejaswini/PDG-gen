import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(reader.readLine());
        double temp = L/3.0;
        double result = temp * temp * temp;
        System.out.printf("%.12f",result);
    }
}
