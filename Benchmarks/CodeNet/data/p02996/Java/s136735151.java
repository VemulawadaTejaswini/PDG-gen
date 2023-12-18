import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int N=sc.nextInt();
      int[][] A = new int[N][2];

      int min;
      int sumA=0;

      for(int i=0;i<N;i++){
        A[i][0]=sc.nextInt();
        A[i][1]=sc.nextInt();
      }

    Arrays.sort(A, (a, b)->a[1]-b[1]);

    for(int i=0;i<N;i++){
      sumA+=A[i][0];
      if(sumA>A[i][1]){
        System.out.println("No");
      }
      else if(i==N){
          System.out.println("Yes");
      }
    }


    }
}
