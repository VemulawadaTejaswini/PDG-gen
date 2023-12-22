import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[3];
        a[0] = scanner.nextInt();
        a[1] = scanner.nextInt();
        a[2] = scanner.nextInt();
        Arrays.sort(a);
        System.out.printf("%d %d %d\n", a[0], a[1], a[2]);
        scanner.close();
    }
}

