import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        String result = "Yes";

        while (true) {
            c = c - b;
            if (c <= 0) {
                break;
            }

            a = a - d;
            if (a <= 0) {
                result = "No";
                break;
            }
        }

        System.out.println(result);
    }
}