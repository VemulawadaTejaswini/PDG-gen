import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int N = stdIn.nextInt();
        int M = stdIn.nextInt();
        int sum_M =0;

        int[] A = new int[N];
        int sum = 0;
        for (int i=0; i<A.length; i++){
            A[i] = stdIn.nextInt();
            sum += A[i];
        }
        //System.out.println("sum:"+sum);

        for (int i=0; i<M; i++){
            sum_M += A[i];
        }
        //System.out.println("sum_M:"+sum_M);
        //System.out.println("M:"+M);
        //System.out.println("sum/(4*M):"+sum/(4*M));
        if(sum_M > sum/(4*M) ){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }




    }
}