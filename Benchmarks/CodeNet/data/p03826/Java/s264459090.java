import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = Integer.parseInt(scanner.next());
        int B = Integer.parseInt(scanner.next());
        int C = Integer.parseInt(scanner.next());
        int D = Integer.parseInt(scanner.next());

        scanner.close();

        int abArea = A * B;
        int cdArea = C * D;

        int maxArea = Math.max(abArea, cdArea);
        System.out.println(maxArea);
    }
}
