import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        int N = sc.nextInt();
        long nCount = 0;
        long k = 0;
        long i = 0;
        while (true) {
            if (i % Math.pow(100,D) == 0 && i % Math.pow(100,D + 1) != 0) {
                k = i;
                if (N == nCount++) break;
            }
            i++;
        }
        System.out.println(k);
    }
}
