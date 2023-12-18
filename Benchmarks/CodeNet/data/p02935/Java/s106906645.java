import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        float s[] = new float[n];

        for (int i = 0; i < s.length; i++) {
            s[i] = scan.nextInt();
        }
        Arrays.sort(s);
        float sum = 0;
        for (int i = 0; i < s.length - 2; i++) {
            sum = (s[i] + s[i + 1]) / 2;
            sum = (s[i + 2] + sum) / 2;
        }
        if (s.length == 2) {
            System.out.println((s[0] + s[1]) / 2);

        } else {
            System.out.println(sum);
        }
    }
}
