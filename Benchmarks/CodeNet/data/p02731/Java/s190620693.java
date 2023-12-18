import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int L = stdIn.nextInt();
        stdIn.close();
        double x = L / 3.0;
        double result = x * x * x;
        System.out.printf(result);
    }
}