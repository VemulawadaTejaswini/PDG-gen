import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        in.nextLine();

        char[][] chs = new char[N][N];
        for (int i = 0; i < N; i++) {
            String line = in.nextLine();
            chs[i] = line.substring(0, N).toCharArray();
        }
        
        Main m = new Main();
        int ret = m.solve(chs);
        System.out.println(ret);
    }
    
    int solve(char[][] chs) {
        int N = chs.length;
        int total = 0;
        for (int i = 0; i < N; i++) {
            if (isValid(chs, i)) total += N;
        }
        return total;
    }

    boolean isValid(char[][] chs, int i) {
        int N = chs.length;
        for (int r = 0; r < N; r++) {
            int c = (i + r) % N;
            for (int p = 0; p < N; p++) {
                if (chs[r][(i+p)%N] != chs[p][c]) return false;
            }
        }
        return true;
    }
}
