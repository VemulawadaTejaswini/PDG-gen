import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] a = new int[N][M];
        int[] count = new int[M];
        int num = 0;

    for(int i=0;i<N;i++){
        a[i][0] = sc.nextInt();
        for(int j=1;j<=a[i][0];j++){
            a[i][j] = sc.nextInt();
            count[a[i][j]-1]++;
        }
    }
    for(int i=0; i<M; i++){
        if(count[i] == N){
            num++;
        }
    }
    System.out.println(num);
    }
}
