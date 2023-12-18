import java.util.Scanner;

public class Main {
    static char[][] A;
    static int h, w;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String res = "Possible";
        h = sc.nextInt();
        w = sc.nextInt();
        A = new char[h][w];
        for(int i = 0; i < h; i++) A[i] = sc.next().toCharArray();
        dfs(0, 0);
        for(char[] ca : A) if(String.valueOf(ca).contains("#")) res = "Impossible";
        System.out.println(res);
    }
    static void dfs(int y, int x) {
        A[y][x] = '.';
        if(y + 1 < h && A[y + 1][x] == '#') dfs(y + 1, x);
        else if(x + 1 < w && A[y][x + 1] == '#') dfs(y, x + 1);
    }
}