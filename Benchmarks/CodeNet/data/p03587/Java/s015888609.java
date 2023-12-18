import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] data = new int[] {Integer.MAX_VALUE, 0};
        for (int i  = 0; i < N; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a < data[0]) {
                data[0] = a;
                data[1] = b;
            }
        }
        int x = data[0] + data[1];
        System.out.println(x);
    }
}