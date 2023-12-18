import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int L = s.nextInt();
        double x = L / 3;
        double y = (L - x) / 2;
        double z = L - x - y;
        double V = x * y * z;

        System.out.println(V);
        s.close();
    }
}