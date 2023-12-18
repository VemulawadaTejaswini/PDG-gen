
import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

    private static void nCombination3(int c) {
        int count = c;
        int num = 0;
        for (int i = 0; i < count - 2; i++) {
            for (int j = i + 1; j < count - 1; j++) {
                for (int k = j + 1; k < count; k++) {
                    num++;
                }
            }
        }
    }



    public static void main(String[] args) {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(),M=sc.nextInt();
        long[] H=new long[N];
        int[] ans = new int[N];
        Arrays.fill(ans,1);
        for(int i=0;i<N;i++){
            H[i]=sc.nextLong();
        }
        int[] A=new int[M],B=new int[M];
        for(int i=0;i<M;i++){
            A[i]=sc.nextInt()-1;
            B[i]=sc.nextInt()-1;
            if(H[A[i]]<=H[B[i]]){
                ans[A[i]]=-1;
            }
            if(H[A[i]]>=H[B[i]]){
                ans[B[i]]=-1;
            }
        }
        int answer = 0;
        for(int i=0;i<N;i++){
            if(ans[i]==1){
                //System.out.println(i+1);
                answer++;
            }
        }
        System.out.println(answer);



    }
}
