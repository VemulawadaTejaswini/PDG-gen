import java.util.Scanner;
public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int g = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        int count = 0;
        for (int i = 0; i <= n; i += r) {
            for (int j = 0; i + j <= n; j+= g) {
                for (int k = 0; i + j + k <= n; k += b) {
                    if (i + j + k == n) {
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
    }
}
