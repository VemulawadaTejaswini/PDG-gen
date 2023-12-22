import java.util.Scanner;

class Main { 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int N = in.nextInt();
            while (N != 0) {
                String X = in.next();
                String Y = in.next();
                int[][] map = new int[X.length() + 1][Y.length() + 1];
                System.out.println(lcs(X, Y, map));
                N--;
            }
        }
    }
    static int lcs(String X, String Y, int[][] map) {
        for (int i = 0; i < X.length(); i++) {
            for (int j = 0; j < Y.length(); j++) {
                if   (X.charAt(i) == Y.charAt(j)) map[i + 1][j + 1] = map[i][j] + 1;
                else                              map[i + 1][j + 1] = Math.max(map[i + 1][j], map[i][j + 1]);
            }
        }
        return map[X.length()][Y.length()];
    }
}