import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int k0,k1,k2,k3,k4,k5,ksum,sum = 0;

        for (int i = 0; i <= N; i++) {
            k5 = (i / 100000) % 10;
            k4 = (i / 10000) % 10;
            k3 = (i / 1000) % 10;
            k2 = (i / 100) % 10;
            k1 = (i / 10) % 10;
            k0 = i % 10;
            ksum = k0 + k1 + k2 + k3 + k4 + k5;
            if (A <= ksum && ksum <= B) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
