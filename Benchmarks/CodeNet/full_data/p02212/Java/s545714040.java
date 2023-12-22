import java.util.Arrays;
import java.util.Scanner;

class A {
    public static void main(String... args) {
        final Scanner sc = new Scanner(System.in);
        final int[] abcd = new int[4];
        Arrays.setAll(abcd, i -> sc.nextInt());
        Arrays.sort(abcd);
        System.out.println(Math.abs(abcd[0] + abcd[3] - abcd[1] - abcd[2]));
    }
}

public class Main {
    public static void main(String... args) {
        A.main();
    }
}

