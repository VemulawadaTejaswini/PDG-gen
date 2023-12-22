import java.util.*;

class Main {

    static int n;
    static char [][] field;

    static int greatest(int x, int y, int size) {
        if (x + size >= n || y + size >= n) return size;
        
        for (int i = 0; i <= size; i++) {
            if (field[x + size][y + i] == '*')  return size;
            if (field[x + i][y + size] == '*')  return size;
        } 

        return greatest(x, y, size + 1);
    }

    static void solve () {

        int result = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (field[i][j] == '.') result = Math.max(result, greatest(j, i, 1));
                if (j >= n - result) break;
            }
            if (i >= n - result) break;
        }

        System.out.println(result);
    }

    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        while(true) {
            n = sc.nextInt();

            if (n == 0) break;

            field = new char[n][n];
            for (int i = 0; i < n; i++) {
                field[i] = sc.next().toCharArray();
            }
            
            solve();
        }

    }
}