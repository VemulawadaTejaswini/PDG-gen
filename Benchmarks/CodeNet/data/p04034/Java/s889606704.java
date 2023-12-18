import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] ballCnt = new int[n];
        char[] color = new char[n];
        Arrays.fill(ballCnt, 1);
        Arrays.fill(color, 'w');
        color[0] = 'r';
        for(int i = 0; i < m; ++i) {
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;
            if(color[y] == 'e') color[y] = color[x];
            else if(color[x] == 'r') color[y] = 'r';
            --ballCnt[x];
            ++ballCnt[y];
            if(ballCnt[x] == 0) color[x] = 'e';
        }
        
        int ans = 0;
        for(int i = 0; i < n; ++i) {
            if(color[i] == 'r') ++ans;
        }
        System.out.println(ans);
    }
}
