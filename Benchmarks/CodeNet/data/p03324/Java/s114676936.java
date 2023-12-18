import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        int N = sc.nextInt();
        int dCount = 0;
        int nCount = 0;
        int k = 0;
        int i = 0;
        while (true) {
            if (D == 0) {
                k = N;
                break;
            }
            else if (i % (100 * D) == 0) {
                k = i;
                if (N == nCount++) break;
            }
            i += 100;
            System.out.println(i);
        }
        System.out.println(k);
    }
}
