import java.util.*;

public class Main {
    public static void main(String[] args ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] all = new int[N];
        for(int i = 0;i < N;i++) {
            all[i] = sc.nextInt();
        }
        Arrays.sort(all);
        int buy = 0;
        for(int i = 0;i < K;i++){
            buy += all[i];
        }
        System.out.println(buy);
    }
}
