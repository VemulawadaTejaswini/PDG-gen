import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] P = new int[N];
        int ans = N;
        for(int i=0;i<N;i++){
            int a = scan.nextInt();
            P[i] = a;
            for(int l=0;l<i+1;l++){
                if(P[l]<a){
                    ans--;
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}
