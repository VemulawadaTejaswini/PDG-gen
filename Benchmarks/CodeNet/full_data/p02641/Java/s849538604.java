import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int N = sc.nextInt();
        int[] Pz = new int[101];
        for (int i = 0; i < N; i++){
            Pz[sc.nextInt()] = 1;
        }
//        Pz.sort();
        int ans = 0;
        for (int i = 0; i < 101; i++){
            if (X - i < 0){
                continue;
            }
            if (Pz[X - i] != 1){
                ans = X - i;
                break;
            }
            if (Pz[X + i] != 1){
                ans = X + i;
                break;
            }
        }
        System.out.println(ans);
    }
}