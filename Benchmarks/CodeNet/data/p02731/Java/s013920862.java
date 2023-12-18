import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        double d = (double)l / 3;
        double v = d * d * d;
        System.out.format("%f", v);
    }
}
