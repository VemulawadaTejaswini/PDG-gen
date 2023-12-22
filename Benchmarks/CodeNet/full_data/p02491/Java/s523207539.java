import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] ab = in.readLine().split(" ");
        int a = Integer.parseInt(ab[0]);
        int b = Integer.parseInt(ab[1]);
        int d = a / b;
        int r = a - d;
        double f = (double)a / b;

        System.out.printf("%s %s %6f%n", d, r, f);
    }
}