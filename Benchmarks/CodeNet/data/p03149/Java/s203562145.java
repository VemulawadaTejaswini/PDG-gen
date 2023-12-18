import java.util.Arrays;
import java.util.Scanner;

class A {
    public static void main(String... args) {
        final Scanner sc = new Scanner(System.in);
        final int[] N = new int[4];
        for (int i = 0; i < 4; i++)
            N[i] = sc.nextInt();
        Arrays.sort(N);
        System.out.println(Arrays.equals(N, new int[]{1, 4, 7, 9}) ? "YES" : "NO");
    }
}

public class Main {
    public static void main(String... args) {
        A.main();
    }
}
