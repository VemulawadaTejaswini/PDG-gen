import java.util.*;
public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int D = Integer.parseInt(sc.next());


        int[][] pointsX = new int[N][D];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < D; j++) {
                pointsX[i][j] = Integer.parseInt(sc.next());
            }
        }

        int count = 0;
        for (int i = 1; i < N; i++) {
            
            for (int j = 0; j < i; j++) {
              	long sum = 0;
                for (int j2 = 0; j2 < D; j2++) {
                    sum += Math.abs(pointsX[i][j2]-pointsX[j][j2]) * Math.abs(pointsX[i][j2]-pointsX[j][j2]);
                }

                if (Math.sqrt(sum) % 1 == 0) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}