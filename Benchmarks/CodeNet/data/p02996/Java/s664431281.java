import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int N=sc.nextInt();
      int[][] A = new int[N+1][2];
      int[][] AA = new int[N+1][2];

      int min;
      int sumA=0;

      for(int i=1;i<=N;i++){
        A[i][0]=sc.nextInt();
        A[i][1]=sc.nextInt();
      }

    for(int i=1;i<=N;i++){
      min=999999999;
      for(int j=1;j<=N;j++){
        if(A[j][1]<min){
          min=A[j][1];
        }
      }
      for(int j=1;j<=N;j++){
        if(A[j][1]==min){
          AA[i][1]=A[j][1];
          AA[i][0]=A[j][0];
          A[j][1]=999999999;
          break;
        }
      }
    }

    for(int i=1;i<=N;i++){
      sumA+=AA[i][0];
      if(sumA>AA[i][1]){
        System.out.println("No");
      }
      else if(i==N){
          System.out.println("Yes");
      }
    }


    }
}
