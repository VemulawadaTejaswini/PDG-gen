import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] island = new int[M][2];

        for (int i = 0; i < M; i++) {
            island[i][0] = sc.nextInt();
            island[i][1] = sc.nextInt();
        }
      
        Arrays.sort(island, Comparator.comparingInt(obj -> obj[1]));

        int nowIsland = 0;
        int bridgeCnt = 0;
        for (int i = 0; i < M; i++) {
            if(island[i][0] >= nowIsland) {
                nowIsland = island[i][1];
                bridgeCnt++;
            }
        }
        System.out.println(bridgeCnt);
    }
}