import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        String seven = 7;
        int count = 0;

        if (k % 2 == 0) {
            System.out.println(-1);
        } else {
            while(seven % k != 0) {
                count++;
                seven = seven * 10 + 7;
            }

            System.out.println(count);
        }
    }
}