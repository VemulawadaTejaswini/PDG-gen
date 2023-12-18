import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        long startTime = System.currentTimeMillis();
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        scanner.close();

        int C = A - B * 2;

        if (C <= 0) {
            C = 0;
        }
        System.out.println(C);

    }

}
