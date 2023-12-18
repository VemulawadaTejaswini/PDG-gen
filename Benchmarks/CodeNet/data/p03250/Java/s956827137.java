import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int[] num = new int[3];
        num[0] = sc.nextInt();
        num[1] = sc.nextInt();
        num[2] = sc.nextInt();

        int[] num2 = Arrays.stream(num).sorted().toArray();
        System.out.println(num[0] + num[1] + num[2] * 10);
    }
}
