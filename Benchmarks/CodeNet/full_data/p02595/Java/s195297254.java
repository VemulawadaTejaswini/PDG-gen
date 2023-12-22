import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long D = sc.nextLong();
        int counter = 0;
        for (int i = 0; i < N; i++) {
            long X = sc.nextLong();
            long Y = sc.nextLong();
            long dist = X * X + Y * Y;
            if (dist <= D * D) {
                counter++;
            }
        }
        System.out.println(counter);
        sc.close();
    }
}