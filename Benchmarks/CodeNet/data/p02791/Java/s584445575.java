import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] Pz = new int[N];
        for (int i = 0; i < N; i++) {
            Pz[i] = sc.nextInt();
        }
        int minVal = 1000000000;
        int cnt = 0;
        for (int i = 0; i < N; i++){
            if (Pz[i] < minVal){
                minVal = Pz[i];
                cnt++;
            }

        }
        System.out.println(cnt);

    }
}