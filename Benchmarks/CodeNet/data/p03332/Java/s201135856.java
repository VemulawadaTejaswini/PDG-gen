import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        long N, A, B, K;
        long red, green, blue, vac;
        long magic = 998244353l;
        long judge;
        long count = 0;
        Scanner sc = new Scanner(System.in);
        N = sc.nextLong();
        A = sc.nextLong();
        B = sc.nextLong();
        K = sc.nextLong();

        for (red = 0; red < N; red++) {
            for (green = 0; green < N; green++) {
                for (blue = 0; blue < N; blue++) {
                    vac = red + green + blue;
                    judge = A * red + (A + B) * green + B * blue;
                    if (judge == K) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count%magic);
    }
}
