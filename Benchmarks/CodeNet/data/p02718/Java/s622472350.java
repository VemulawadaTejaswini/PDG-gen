import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int A[] = new int[N];
        int num_popular_item = 0;
        int total_votes = 0;
        for (int i=0; i<N; i++) {
            A[i] = sc.nextInt();
            total_votes += A[i];
        }
        double r = 0.25 / M;
        for (int i=0; i<N; i++) {
            if (A[i] >= total_votes * r) {
                num_popular_item += 1;
            }
        }
        if (num_popular_item >= M) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}