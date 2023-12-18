import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] Xz = new int[M];
        for (int i = 0; i < M; i++){
            Xz[i] = sc.nextInt();
        }
        Arrays.sort(Xz);
        int[] diffz = new int[M];
        for (int i = 1; i < M; i++){
            diffz[i] = Xz[i] - Xz[i - 1];
        }
        Arrays.sort(diffz);
        int[] diffzT = new int[M];
        for (int i = 0; i < M; i++){
            diffzT[M - i - 1] = diffz[i];
        }
        int sum = 0;
        for (int i = 0; i < M; i++){
            if (i < N - 1){
                continue;
            }
            sum += diffzT[i];
        }

        System.out.println(sum);

    }
}