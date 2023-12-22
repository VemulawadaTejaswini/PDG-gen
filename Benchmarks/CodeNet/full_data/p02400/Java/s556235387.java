import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        double a;
        double pi = 3.1415926535;
        try {
            a = Double.parseDouble(bf.readLine());
            System.out.printf("%.10f %.10f\n", a * a * Math.PI, 2 * a * Math.PI);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
