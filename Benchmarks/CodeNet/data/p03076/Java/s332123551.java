import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        // 入力
        Scanner sc = new Scanner(System.in);
        int[] x = new int[5];
        x[0] = sc.nextInt();
        x[1] = sc.nextInt();
        x[2] = sc.nextInt();
        x[3] = sc.nextInt();
        x[4] = sc.nextInt();
        int result = 0;

        int min = 9;
        int index = 0;
        for (int i = 0; i < 5; i++) {
            int temp = x[i] % 10;
            if (temp != 0 && temp < min) {
                min = temp;
                index = i;
            }
        }

        for (int i = 0; i < 5; i++) {
            if (i == index) continue;
            if (x[i] % 10 == 0) result += x[i];
            else result += (x[i]/10+1)*10;
        }
        result += x[index];
        System.out.println(result);
    }
}