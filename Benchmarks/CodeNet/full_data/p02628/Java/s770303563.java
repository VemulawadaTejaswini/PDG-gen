import java.util.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        sc.nextLine();
        int p[] = new int[N];
        for(int i = 0; i < N; i++)
            p[i] = sc.nextInt();

        int sum = 0;
        Arrays.sort(p);

        for(int i = 0; i < K; i++)
            sum += p[i];

        System.out.println(sum);

    }
}