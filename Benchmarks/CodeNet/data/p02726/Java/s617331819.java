import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        sc.close();

        Map<Integer, Integer> numCntMap = new HashMap<>();
        for (int i = 1; i < N; i++) {
            numCntMap.put(i, 0);
        }

        for (int i = 1; i < N; i++) {
            for (int j = 2; j <= N; j++) {
                if (i >= j) {
                    continue;
                }
                int distance = getMinDistance(i, j, X, Y);
                Integer cnt = numCntMap.get(distance);
                if (Objects.isNull(cnt)) {
                    numCntMap.put(distance, 1);
                } else {
                    cnt += 1;
                    numCntMap.put(distance, cnt);
                }
            }
        }

        for (int i = 1; i < N; i++) {
            System.out.println(numCntMap.get(i));
        }

        System.out.println();
    }

    public static int getMinDistance(int i, int j, int X, int Y) {
        return Math.min(Math.abs(j - i),
                Math.min(Math.abs(X - i) + 1 + Math.abs(j - Y), Math.abs(Y - i) + 1 + Math.abs(j - X)));
    }

}
