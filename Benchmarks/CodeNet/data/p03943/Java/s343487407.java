import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int[] n = Arrays.stream(sc.nextLine().split(" ", 0)).mapToInt(x -> Integer.parseInt(x)).toArray();

        boolean b = false;
        if (n[0] + n[1] == n[2]) {
            System.out.println("Yes");
            b = true;
        } else if (n[1] + n[2] == n[0]) {
            System.out.println("Yes");
            b = true;
        } else if (n[0] + n[2] == n[1]) {
            System.out.println("Yes");
            b = true;
        }

        if (!b) {
            System.out.println("No");
        }
    }
}
