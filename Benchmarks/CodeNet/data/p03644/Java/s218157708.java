import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 2; i <= n; i++) {
            int temp = 0;
            int num = i;
            while (num % 2 == 0) {
                num = num / 2;
                temp++;
            }
            count += temp;
        }
        System.out.println(count);
    }
}
