import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        boolean[] sunuke = new boolean[n];
        for (int i = 0; i < k; i++){
            int d = input.nextInt();
            for (int j = 0; j < d; j++){
                sunuke[input.nextInt() - 1] = true;
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++){
            if (!sunuke[i]){
                ans += 1;
            }
        }
        System.out.println(ans);

    }
}