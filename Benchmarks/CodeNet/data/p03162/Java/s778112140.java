import java.util.Scanner;

public class Vacation {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int N = sc.nextInt();
        int[][] vacation = new int[N][3];

        for(int i=0;i<N;++i) {
            vacation[i][0] = sc.nextInt();
            vacation[i][1] = sc.nextInt();
            vacation[i][2] = sc.nextInt();
        }

        int[][] solution = new int[N][3];
        solution[0][0] = vacation[0][0];
        solution[0][1] = vacation[0][1];
        solution[0][2] = vacation[0][2];

        for(int i=1;i<N;++i) {
            solution[i][0] = vacation[i][0] + Math.max(solution[i-1][1], solution[i-1][2]);
            solution[i][1] = vacation[i][1] + Math.max(solution[i-1][0], solution[i-1][2]);
            solution[i][2] = vacation[i][2] + Math.max(solution[i-1][0], solution[i-1][1]);
        }

        System.out.println(Math.max(Math.max(solution[N-1][0], solution[N-1][1]), solution[N-1][2]));
    }
}
