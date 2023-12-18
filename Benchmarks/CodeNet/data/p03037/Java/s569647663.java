import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] L = new int[M];
        int[] R = new int[M];
        int ans = 0;
        L[0] = sc.nextInt();
        R[0] = sc.nextInt();
        int l = L[0];
        int r = R[0];

        for(int i=1; i<M; i++){
            L[i] = sc.nextInt();
            R[i] = sc.nextInt();
            if(L[i]>l){
                l = L[i];
            }
            if(R[i]<r){
                r = R[i];
            }
        }
        for(int i=l; i<=r; i++){
            ans += 1;
        }
        System.out.println(ans);
    }
}