import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        int D = scan.nextInt();

        int i = 0;
        while (true) {
            if (i % 2 == 0) {
                C -= B;
                if (C <= 0) {
                    System.out.println("Yes");
                    break;
                }
            } else {
                A -= D;
                if (A <= 0) {
                    System.out.println("No");
                    break;
                }
            }
            i++;
        }
        scan.close();
    }

}