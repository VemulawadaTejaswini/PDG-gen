import java.util.*;
class Main{
    static int[] check;
    static int[][] mat;
    static int N,K;
    static List<Integer> colors;
    public static void main(String argv[]) {
        Scanner sc = new Scanner(System.in);
        long mod = 1000000007;
        N = sc.nextInt();
        K = sc.nextInt();
        mat = new int[N][N];
        check = new int[N];
        int start = 0;
        for(int i=0;i<N-1;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            mat[x-1][y-1] = 1;
            mat[y-1][x-1] = 1;
            if(i==0)start = x-1;
        }

        //dump();
        colors = new ArrayList<>();
        search(start);

        long result = 1;
        for(Integer e:colors){
            result = (long)(result*e)%mod;
        }
        System.out.println(result);
    }

    public static void dump() {
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void search(int node) {
        if(check[node]==1)return;
        colors.add(K-count_visited_within2step(node));
        check[node] = 1;
        //System.out.println(colors);
        for(int i=0;i<N;i++){
            if(mat[node][i]==1){
                if(check[i]==0)search(i);
            }
        }
        return;
    }

    public static int count_visited_within2step(int a) {
        int count=0;
        for(int i=0;i<N;i++){
            if(mat[a][i]==1){
                if(check[i] == 1){
                    count += count_visited_within2step_2(i);
                    count++;
                }
            }
        }
        return count;
    }

    public static int count_visited_within2step_2(int a) {
        int count=0;
        for(int i=0;i<N;i++){
            if(mat[a][i]==1){
                if(check[i] == 1){
                    count++;
                }
            }
        }
        return count;
    }
}