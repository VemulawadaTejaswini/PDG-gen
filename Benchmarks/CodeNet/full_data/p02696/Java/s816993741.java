import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int N = sc.nextInt();
        int r;
        int max = 0;
        int index = 0;

        for (int i = N; 1 <= i; i--) {
            r = (int) Math.floor(A * i / B);
            if (r > max) {
                index = i;
                max = r;
            }
        }
        int result = (int) (Math.floor(A * index / B) - A * Math.floor(index / B));
        System.out.println(result);

    }
}