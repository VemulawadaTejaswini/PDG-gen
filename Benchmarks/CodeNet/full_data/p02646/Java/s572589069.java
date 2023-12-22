import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int V = sc.nextInt();
        int B = sc.nextInt();
        int W = sc.nextInt();
        int T = sc.nextInt();
        sc.close();
        long zahyoA = A;
        long zahyoB = B;
        for (int i = 0; i < T; i++) {
            if (zahyoB > zahyoA ) {
                zahyoB += W;
                zahyoA += V;
            }else if(zahyoB < zahyoA ){
                return;
            }
            if (zahyoB == zahyoA ) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
