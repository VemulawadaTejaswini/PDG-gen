import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int max = (N-1)*(N-2)/2;
        if(K> max) {
            System.out.println(-1);
            return;
        }

        int diff = max - K;
        System.out.println(N-1+diff);
        for(int i = 1; i<N; i++) {
            System.out.println(1 + " " + (i+1));
        }
        for(int i = 2; i<N+1; i++) {
            for(int j = i+1; j<N+1; j++) {
                if(diff <= 0) break;
                diff--;
                System.out.println(i + " " + j);
            }
        }
    }
}