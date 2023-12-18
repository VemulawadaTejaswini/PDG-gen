import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] b = new Integer[n - 1];
        for (int i = 0; i < n - 1; i++) {
            b[i] = sc.nextInt();
        }

        int result = 0;
        for (int i = 0; i < b.length; i++) {
            if (i > 0 && i < b.length - 1) {
                if (b[i] > b[i - 1] && b[i] > b[i + 1]) {
                    result += Math.max(b[i - 1], b[i + 1]);
                } else {
                    result += b[i];
                }
            } else {
                result += b[i];
            }
        }
        result += Math.min(b[0], b[b.length - 1]);

        System.out.println(result);
    }
}
