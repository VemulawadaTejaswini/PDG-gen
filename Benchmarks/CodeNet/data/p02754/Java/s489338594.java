import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int count = 0;
        int all = 0;
        while (all < N) {
            for (int i = 0; i < A;i++) {
                count++;
                all++;
                if (all == N) break;
            }
            if (all == N) break;
            for (int i = 0; i < B; i++) {
                all++;
                if (all == N) break;
            }
            if (all == N) break;
        }
        System.out.println(count);
    }
}