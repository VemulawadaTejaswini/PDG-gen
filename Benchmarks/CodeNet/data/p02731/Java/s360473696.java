import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int L = s.nextInt();
        double x = L / 3;
        double V = x * x * (L - x - x);

        System.out.println(V);
        s.close();
    }
}