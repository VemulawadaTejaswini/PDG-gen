import java.util.Scanner;

public class Main {

    public Main() {
        Scanner scanner = new Scanner(System.in);
        long A = scanner.nextLong();
        double B = scanner.nextDouble();

        long R = (A* (long)(B*100L))/100L;

        System.out.println(R);
    }

    public static void main(String[] args) {
        new Main();
    }
}
