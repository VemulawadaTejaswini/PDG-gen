import java.util.Scanner;
import java.util.Arrays;

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

        Arrays.sort(A);
        for (int i=N-1; i>N-1-M; i--){
            //System.out.print(A[i]+" ");
            sum_M += A[i];
        }
        //System.out.println(sum_M);

        if(sum_M >= sum/(4*M) ){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }




    }
}