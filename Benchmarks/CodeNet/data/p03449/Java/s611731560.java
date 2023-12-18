import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] a= new int[N+2][4];
        int[][] b = new int[N+2][4];
        for(int i = 1; i<3; i++) {
            for(int j = 1; j<N+1; j++) {
                a[j][i] = sc.nextInt();
            }
        }
        for(int i = 1; i<N+1; i++) {
            for(int j = 1; j<3; j++) {
                a[i][j] = Math.max(a[i-1][j]+a[i][j], a[i][j-1]+a[i][j]);
            }
        }
        System.out.println(a[N][2]);
    }
}