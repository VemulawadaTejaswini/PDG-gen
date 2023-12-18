import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] Az = new int[N];
        int[] sortedAz = new int[N];
        for (int i = 0; i < N; i++){
            Az[i] = sc.nextInt();
        }
        Arrays.sort(Az);
        int sum = 0;
        for (int i = 0; i < N; i++){
            sortedAz[i] = Az[N-i-1];
            sum += Az[N-i-1];
        }

        double limit = (double) sum / (4*M);
        for (int i = 0; i < M; i++){
            if (sortedAz[i] < limit){
                System.out.println("No");
                System.exit(0);
            }
        }
        System.out.println("Yes");
    }
}