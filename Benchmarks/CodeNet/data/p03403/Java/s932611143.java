import java.util.*;

import static java.lang.Math.abs;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        int[] spot = new int[N+2];
        spot[0] = 0;
        spot[N+1] = 0;
        for(int i = 1; i <= N; i++){
            spot[i] = scan.nextInt();
        }
        
        int sum = 0;
        int[] dif = new int[N+2];
        dif[0] = 0;
        for(int i = 1; i <= N+1; i++){
            dif[i] = abs(spot[i] - spot[i-1]);
            sum += dif[i];
        }

        int ans;
        for(int i = 1; i <= N; i++){
            ans = sum;
            ans -= dif[i];
            ans -= dif[i+1];
            ans += abs(spot[i+1] - spot[i-1]);
            System.out.println(ans);
        }
    }
}