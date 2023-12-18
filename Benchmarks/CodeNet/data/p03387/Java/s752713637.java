import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] data = new int[3];
        data[0] = scan.nextInt();
        data[1] = scan.nextInt();
        data[2] = scan.nextInt();
        Arrays.sort(data);
        int a = data[2] - data[0];
        int b = data[2] - data[1];
        int c = data[1] - data[0];
        int answer = Integer.MAX_VALUE;
        if (a % 2 == 0 && b % 2 == 0) {
            answer = Math.min(answer, a / 2 + b / 2);
        }
        if (c % 2 == 0) {
            answer = Math.min(answer, b + c / 2);
        }
        if (c % 2 != 0) {
            answer = Math.min(answer, b + 1 + (c + 1) / 2);
        }
        System.out.println(answer);
    }
}
