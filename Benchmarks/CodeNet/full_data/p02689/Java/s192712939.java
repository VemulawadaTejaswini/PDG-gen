import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] H = new int[N];

        for (int i = 0; i < N; i++) {
            H[i] = sc.nextInt();
        }

        int A, B;
        Set<Integer> Dtowers = new HashSet<>();

        for (int i = 0; i < M; i++) {
            A = sc.nextInt();
            B = sc.nextInt();
            if(H[A-1]>=H[B-1]){
                Dtowers.add(B);
            }else{
                Dtowers.add(A);
            }
            
        }

        System.out.println(N - Dtowers.size());

        sc.close();
    }
}