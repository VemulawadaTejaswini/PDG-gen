import java.util.*;

class Main {

    static int H;
    static int W;
    static int K;
    static char[][] A;
    static boolean[][] visited;
    static int min;
    static ArrayList<int[]> list;

    public static void f(int y, int x, int k) {
        if (visited[y][x]) return;
        visited[y][x] = true;
        min = Math.min(min, y);
        min = Math.min(min, H-1-y);
        min = Math.min(min, x);
        min = Math.min(min, W-1-x);

        if (k==K) return;

        for (int[] arr : list) {
            if (0<=y+arr[0] && y+arr[0]<H && 0<=x+arr[1] && x+arr[1]<W && A[y+arr[0]][x+arr[1]]=='.') {
                f(y+arr[0], x+arr[1], k+1);
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        H = sc.nextInt();
        W = sc.nextInt();
        K = sc.nextInt();
        A = new char[H][W];
        visited = new boolean[H][W];
        min = 19191919;
        list = new ArrayList<int[]>();
        int[] add_1 = {1, 0};int[] add_2 = {-1, 0};int[] add_3 = {0, 1};int[] add_4 = {0, -1};
        list.add(add_1);list.add(add_2);list.add(add_3);list.add(add_4);
        int sy = -1;
        int sx = -1;
        for (int i=0;i<H;i++) {
            String S = sc.next();
            for (int j=0;j<W;j++) {
                A[i][j] = S.charAt(j);
                if (A[i][j]=='S') {
                    A[i][j] = '.';
                    sy = i;
                    sx = j;
                }
            }
        }
        f(sy, sx, 0);

        System.out.println((min+K-1)/K+1);
    }
}