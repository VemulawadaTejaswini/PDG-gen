import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int D = sc.nextInt();
        int[] Xz = new int[N];
        int[] Yz = new int[N];
        for (int i = 0; i < N; i++){
            Xz[i] = sc.nextInt();
            Yz[i] = sc.nextInt();
        }
        double ans = 0;
        int cnt = 0;
        for (int i = 0; i < N; i++){
            ans = Math.sqrt(Math.pow(Xz[i], 2) + Math.pow(Yz[i], 2));
            if (ans <= D){
                cnt++;
            }
        }
        System.out.println(cnt);

    }
}