import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: ngupta
 * Date: 5/5/2020 AD
 * Time: 00:33
 */
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] height = new int[N];
        for (int i = 0; i < N; i++) {
            height[i] = sc.nextInt();
        }

        int[][] graph = new int[N][N];
        for (int i = 0; i < M; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            graph[x - 1][y - 1] = 1;
            graph[y - 1][x - 1] = 1;
        }

//        Arrays.stream(graph).forEach(row -> System.out.println(Arrays.toString(row)));
        int count = 0;
        for (int i = 0; i < N; i++) {
            boolean good = true;
            boolean atleastOneRoad = false;
            for (int j = 0; j < N; j++) {
                if (i != j && graph[i][j] == 1) {
                    atleastOneRoad = true;
                    if (height[i] < height[j]) {
                        good = false;
                        break;
                    }
                }
            }
            if (atleastOneRoad && good) {
                count++;
            }
        }

        System.out.println(count);
    }
}
