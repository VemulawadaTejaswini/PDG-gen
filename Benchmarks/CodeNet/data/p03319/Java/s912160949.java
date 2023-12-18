import java.util.Arrays;
import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N  = scan.nextInt();
        int K  =scan.nextInt();
        int[] A = new int[N];
        for(int i=0;i<N;++i)A[i]=scan.nextInt();
        int min = Integer.MAX_VALUE;
        for(int i=0;i<N;++i)min=Math.min(min, A[i]);
        int ans =0;
        for(int i=0;i<N;++i){
            if(A[i]>min){
                ++ans;
                i+=K-2;
            }
        }
        System.out.println(ans);
    }
}