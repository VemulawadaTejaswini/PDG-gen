import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        long sum = 1;
        long over = (long) Math.pow(10, 18);
        for (;n > 0; n--) {
            sum *= scan.nextLong();
        }

        if (sum > over) {
            System.out.println(-1);
            return;
        }

        System.out.println(sum);
    }
}
