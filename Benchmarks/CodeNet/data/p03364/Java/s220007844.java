import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        char[][] map = new char[N][N];
        for (int i=0;i<N;i++) {
            String S = sc.next();
            for (int j=0;j<N;j++) {
                map[i][j] = S.charAt(j);
            }
        }

        int ans = 0;
        for (int k=0;k<N;k++) {
            char[][] map_2 = new char[N][N];
            for (int i=0;i<N;i++) {
                for (int j=0;j<N;j++) {
                    map_2[i][j] = map[(i+k)%N][j];
                }
            }

            int flag = 0;
            loop:for (int i=0;i<N;i++) {
                for (int j=i;j<N;j++) {
                    if (map_2[i][j]!=map_2[j][i]) {
                        flag=1;
                        break loop;
                    }
                }
            }
            if (flag==0) ans++;
        }
        System.out.println(ans*N);
    }
}