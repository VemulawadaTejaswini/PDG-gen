import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        for (int i = 0; i < n-1; i++) {
            System.out.print(a[n-1-i]);
            System.out.print(" ");
        }
        System.out.print(a[0]);
        System.out.print("\n");
    }
}

