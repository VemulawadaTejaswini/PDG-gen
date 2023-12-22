import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Main main = new Main();
        main.solv();
    }
    
    private int[][][] counts = new int[4][3][10];
    
    private void solv() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        while (n-- > 0) {
            int b = input.nextInt();
            int f = input.nextInt();
            int r = input.nextInt();
            int v = input.nextInt();
            counts[b-1][f-1][r-1] += v;
        }
        for (int i = 0; i < 4; i++) {
            if (i != 0) {
                System.out.println("####################");
            }
            for (int j = 0; j < 3; j++) {
                StringBuilder sb = new StringBuilder();
                for (int k = 0; k < 10; k++) {
                    sb.append(' ').append(counts[i][j][k]);
                }
                System.out.println(sb.toString());
            }
        }
    }
}