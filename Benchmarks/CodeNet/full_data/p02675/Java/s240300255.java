import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        if (A % 10 == 3) {
            System.out.println("bon");
        } else if (check(new int[]{0, 1, 6, 8}, A % 10)) {
            System.out.println("pon");
        } else {
            System.out.println("hon");
        }
    }

    private static boolean check(int[] ints, int i) {
        for (int anInt : ints) {
            if (anInt == i) {
                return true;
            }
        }
        return false;
    }
}