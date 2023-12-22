import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        //*
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String s = in.readLine();
            if (s == null) {
                break;
            }
            f(s);
        }
        //*/
    }

    public static void f(String s) {
        double a = Double.parseDouble(s);
        double sum = a;
        for (int i = 2; i <= 10; i++) {
            if (i % 2 == 0) {
                a *= 2;
            } else {
                a /= 3;
            }
            sum += a;
        }
        System.out.println(sum);
    }
}