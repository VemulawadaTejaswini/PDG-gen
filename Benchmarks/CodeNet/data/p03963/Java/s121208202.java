import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int result = 1;

        if (K == 1) {
            System.out.println(N);
        } else {
            for (int i=1; i <=N-1; i++){
                result *= K-1; 
            }
            System.out.println(K * result);
        }
    }
}