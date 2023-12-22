import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int N,M;

        Scanner scn = new Scanner(System.in);
        N = scn.nextInt();
        M = scn.nextInt();
        int[] h = new int[N];
        int[] a = new int[M];
        int[] b = new int[M];

        boolean[] ans = new boolean[N];
        //Hの入力
        for(int i=0;i<N;i++){
            h[i] = scn.nextInt();
        }
        //A,Bの入力と計算
        for(int i=0;i<M;i++){
            a[i] = scn.nextInt();
            b[i] = scn.nextInt();
        }

        int cnt = 0;

        //計算
        for(int i=0;i<M+1;i++){
            if(h[a[i]-1] < h[b[i]-1]){
                ans[b[i]-1] = true;
            }else{
                ans[a[i]-1] = false;
            }
        }

        for(int i=0;i<M+1;i++){
            if(ans[i]){
                cnt++;
            }
        }
        System.out.println(cnt);


    }
}