import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean[] A = new boolean[N];
        for (int i = 0; i < N; i++) {
            int n  = sc.nextInt();
            A[i]=n==1? false:true;//false=odd, true=even
        }

        boolean[] ans  = new boolean[N];
        int count=0;
        for (int i = N-1; i >=0; i--) {
            if( (i+1) <= N/2){
                int j = (i+1)*2;
                boolean b = A[i];
                while(j<N){
                    b = b ^ A[j-1];
                    j+=(i+1);
                }
                ans[i] = b;
            }else{
                ans[i] = A[i];
            }

            if(A[i] = false) count++;

        }
        System.out.println(count);
        for (int i = 0; i < N; i++) {
            if(ans[i]) System.out.println(i+1);
        }
    }

}