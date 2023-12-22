import java.util.*;

public class Main{
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int A[] = new int[N];
        for(int loop=0; loop<N; loop++) {
            A[loop] = scanner.nextInt();
        }

        int town = 1;
        for(int teleportN=0; teleportN<K; teleportN++){
            town = A[town-1];
        }

        System.out.println( town );

    }
}