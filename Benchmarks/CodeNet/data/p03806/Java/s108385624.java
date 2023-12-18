import java.util.*;
import java.lang.*;


class Chemical{
    int typeA;
    int typeB;
    int cost;
    public Chemical(int a, int b, int c){
        typeA = a;
        typeB = b;
        cost = c;
    }
}

public class Main {
    static void possible(){
        System.out.println("Yes");
        System.exit(0);
    }
    static void impossible(){
        System.out.println("-1");
        System.exit(0);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Ma = sc.nextInt();
        int Mb = sc.nextInt();
        Chemical[] chemical = new Chemical[N];
        for(int n=0; n<N; n++) chemical[n] = new Chemical(sc.nextInt(),sc.nextInt(),sc.nextInt());

        int[][] dp = new int[500][500];
        for(int a=0; a<500; a++)for(int b=0; b<500; b++) dp[a][b]=1_000_000_000;
        dp[0][0] = 0;
        for(int n=0; n<N; n++){
            int[][] next = new int[500][500];
            for(int a=0; a<500; a++)for(int b=0; b<500; b++) next[a][b]=dp[a][b];
            for(int a=0; a<500; a++)for(int b=0; b<500; b++){
                int na = a+chemical[n].typeA;
                int nb = b+chemical[n].typeB;
                if(na <500 && nb <500){
                    next[na][nb] = Math.min(next[na][nb], dp[a][b]+chemical[n].cost);
                }
            }
            dp = next;
        }


        int ans = 1_000_000_000;
        for(int x=1; Ma*x<500&&Mb*x<500; x++) ans = Math.min(ans, dp[Ma*x][Mb*x]);
        if(ans >= 1_000_000_000) impossible();
        else System.out.println(ans);
    }
}
