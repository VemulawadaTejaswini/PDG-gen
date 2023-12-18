import java.util.*;

class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            if (a % 2 == 0) {
                System.out.println("Even");
                return;
            }

            int b = sc.nextInt();
            if (b % 2 == 0) {
                System.out.println("Even");
                return;
            }

            System.out.println("Odd");
            return;
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}