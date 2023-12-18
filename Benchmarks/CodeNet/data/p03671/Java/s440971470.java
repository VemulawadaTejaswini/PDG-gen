import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] bell = new int[3];
        for (int i = 0; i < bell.length; i++) {
            bell[i] = sc.nextInt();
        }

        Arrays.sort(bell);
        System.out.println(bell[0] + bell[1]);
    }
}