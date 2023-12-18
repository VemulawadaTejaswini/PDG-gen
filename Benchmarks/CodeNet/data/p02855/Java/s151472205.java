import java.util.*;
 
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int K = sc.nextInt();
        int[][] cake = new int[H][W];
        int num  = 0;
        for (int i = 0; i < H; i++) {
            num++;
            String s = sc.next();
            boolean preSet = true;
            for (int j = 0; j < W; j++) {
                if (s.charAt(j) == '#') {
                    if (preSet) { 
                        cake[i][j] = num;
                        preSet = false;
                    } else {
                        cake[i][j] = ++num;
                    }
                } else {
                    cake[i][j] = num;
                }
            }
        }
        System.out.println(Arrays.deepToString(cake));
    }
}
