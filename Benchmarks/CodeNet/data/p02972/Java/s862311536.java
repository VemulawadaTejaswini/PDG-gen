import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean[] A = new boolean[N+1];
        for (int i = 1; i <= N; i++) {
            int n  = sc.nextInt();
            A[i]= n==1 ? true:false;//true=odd, false=even
        }

        boolean[] ans  = new boolean[N+1];
        int count=0;
        for (int i = N; i >=1; i--) {
//            if( i <= N/2){
                int j = i*2;
                boolean b = A[i];
                while(j<=N){
                    b = b ^ ans[j];
                    j+=i;
                }
                ans[i] = b;
//            }else{
//                ans[i] = A[i];
//            }

            if(ans[i] == true) count++;

        }
        System.out.println(count);
        for (int i = 1; i <= N; i++) {
            if(ans[i]) System.out.print(i +" ");
        }
    }

}
