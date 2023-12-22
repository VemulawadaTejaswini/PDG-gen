import java.util.Scanner;
public class Main{
  public static void main(String[] args){
  	Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int K = sc.nextInt();
    int[] A = new int[N];
    int[] B = new int[M];
    int book = 2;
    for(int i=0;i<N;i++)
      A[i] = sc.nextInt();
    for(int i=0;i<M;i++)
      B[i] = sc.nextInt();
    int i = 0;
    while(A[i] + B[i] <= K){
       A[i] = A[i] + A[i+1];
      if(A[i] + B[i] > K)
        break;
      else
        book++;
      B[i] = B[i] + B[i+1];
      if(A[i] + B[i] > K)
        break;
      else
      	book++;
    }
    System.out.println(book);
  }
}
