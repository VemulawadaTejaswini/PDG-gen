import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();

        int sum = 0;
        for (int i = 0; i <= N; i++) {
            String str = String.valueOf(i);
            String[] array = str.split("");
            int digit_sum = 0;
            for (int j = 0; j < array.length; j++) {
                digit_sum += Integer.parseInt(array[j]);
            }
            if (digit_sum >= A && digit_sum <= B) {
                sum += i;
            }
        }

        System.out.printf("%d\n", sum);
        sc.close();
    }
}