import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[][] judg = new boolean[n+1][n+1];

        for(int i=0;i<n+1;i++){
            Arrays.fill(judg[i],false);
        }

        for(int i=0;i<n;i++){
            int u = sc.nextInt();
            int k = sc.nextInt();
            for(int j=0;j<k;j++){
                int v = sc.nextInt();
                judg[u][v] = true;
            }
        }

        int[] d = new int[n+1];
        int[] f = new int[n+1];
        int count = 0;

        for(int i=1;i<=n;i++){
            count = func(judg,d,f,i,count);
        }

        for(int i=1;i<=n;i++){
            System.out.println(i+" "+d[i]+" "+f[i]);
        }
    }

    static int func(boolean[][] judge,int[] d,int[] f,int now,int count){
        if(d[now]!=0){
            return count;
        }
        d[now] = ++count;
        for(int i=1;i<judge.length;i++){
            if(judge[now][i]){
                count = func(judge,d,f,i,count);
            }
        }
        f[now] = ++count;
        return count;
    }
}