import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int Q = sc.nextInt();
        int[][] rec = new int[510][510];
        for(int i=1;i<=M;i++){
            int L = sc.nextInt();
            int R = sc.nextInt();
            rec[L][R] += 1;
        }
        int[][] head = new int[510][510];
        for(int row=1;row<=N;row++){
            for(int col=N;col>=row;col--){
                head[row][col] += head[row][col+1]+rec[row][col];
            }
        }
        int[][] tail =  new int[510][510];
        for(int col=N;col>=1;col--){
            for(int row=1;row<=col;row++){
                tail[row][col] = tail[row-1][col]+rec[row][col];
            }
        }
        for(int j=1;j<=Q;j++){
            int p = sc.nextInt();
            int q = sc.nextInt();
            System.out.println(head[p][q]+tail[p][q]-rec[p][q]);
        }
    }
}
