import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inp[] = new int[333];
        int n = in.nextInt();
        int ans = (int)1e9;
        for(int i = 1; i <= n; i++){
            inp[i] = in.nextInt();
            int tmp = 0;
            while(inp[i] % 2 == 0){
                tmp++;
                inp[i] /= 2;
            }
            ans = Math.min(ans, tmp);
        }
        System.out.println(ans);
    }
}