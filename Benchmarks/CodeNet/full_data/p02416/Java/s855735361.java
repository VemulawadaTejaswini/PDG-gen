import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();
        char[] a = string.toCharArray();

        while (a[0] != '0') {
            int i = 0;
            int sum = 0;
            while (i < a.length) {
                sum += a[i++] - '0';
            }
            System.out.println(sum);
            string = scan.nextLine();
            a = string.toCharArray();
        }
    }
}