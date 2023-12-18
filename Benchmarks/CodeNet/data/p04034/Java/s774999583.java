import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] balls = new int[n];
        Boolean[] bools = new Boolean[n];
        Arrays.fill(balls,1);
        Arrays.fill(bools,false);
        bools[0] = true;
        for(int i = 0; i < m; i++){
            int x = sc.nextInt()-1;
            int y = sc.nextInt()-1;
            balls[x]--;
            balls[y]++;
            if(bools[x]){
                bools[y] = true;
            }
            if(balls[x] == 0){
                bools[x] = false;
            }
        }
        int ans = 0;
        for(boolean b : bools){
            if(b) ans++;
        }
        System.out.println(ans);
    }
}