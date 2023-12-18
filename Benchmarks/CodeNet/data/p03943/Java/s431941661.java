import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] c = new int[3];
        c[0] = sc.nextInt();
        c[1] = sc.nextInt();
        c[2] = sc.nextInt();
        Arrays.sort(c);

        if (c[0] + c[1] == c[2]) {
            System.out.println("Yes");
            return;
        }
        System.out.println("No");
    }

}
