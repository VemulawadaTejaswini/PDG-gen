import java.util.*;

class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] h = new int[n+1];
        int[][] route = new int[n+1][n+1];
        for(int i=1;i<=n;i++){
            h[i] = sc.nextInt();
        }
        for(int i=0;i<m;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            route[a][b] = 1;
            route[b][a] = 1;
        }

        int count = 0;

        for(int i=1;i<=n;i++){
            boolean flag = true;
            int t = 0;
            int hight = h[i];
            for(int j=1;j<=n;j++){
                if(route[i][j]==1){
                    t++;
                    if(hight<=h[j]){
                        flag = false;
                        break;
                    }
                }
            }
            if(t==0 || flag){
                count++;
            }
        }

        System.out.println(count);
    }
}
