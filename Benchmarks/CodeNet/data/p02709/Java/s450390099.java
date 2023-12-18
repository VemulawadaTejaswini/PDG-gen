import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] A = new long[N];
        for(int i=0;i<N;i++){
            A[i] = sc.nextLong();
        }
        long sum = 0;
        for(int k=0;k<N;k++){
            int i=-1;
            if(k % 2 == 0){
                i = k/2;
            }else{
                i = N-1-(k/2);
            }
            int maxind = 0;
            long maxVal = -1;
            for(int j=0;j<N;j++){
                if(A[j] * (long)Math.abs(j-i) > maxVal){
                    maxVal = A[j] * (long)Math.abs(j-i);
                    maxind = j;
                }
            }
            A[maxind] = 0;
            sum += maxVal;
        }
        System.out.println(sum);
    }

}
