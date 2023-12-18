import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int counter = 0;
        while (A > 0 && C > 0) {
            if (counter % 2 == 0) {
                C -= B;
            } else {
                A -= D;
            }
            counter++;
        }
        if (A > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}