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
            for (int j = 0; j < N; j++) {
                if (isValid(chs, i, j)) total += 1;
            }
        }
        // if (N%2 == 1) {
        //     if (isValid(chs, N/2+1, N/2+1)) total += 1;
        // }
        return total;
    }

    boolean isValid(char[][] chs, int i, int j) {
        int N = chs.length;
        for (int k = 0; k < N; k++) {
            int r = (i + k) % N;
            int c = (j + k) % N;
            for (int p = 0; p < N; p++) {
                if (chs[r][(p+j)%N] != chs[(p+i)%N][c]) return false;
            }
        }
        return true;
    }
}
