import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long M = sc.nextLong();
    long count=0;
    long[] A = new long[N+1];
    long[] Asum = new long[N+1];
    for(int i=1;i<=N;i++){
      A[i] = (sc.nextLong())%M;
      Asum[i] = Asum[i-1] + A[i];
  //    System.out.println(Asum[i]);
    }

    for(int i=0;i<=N-1;i++){
      for(int j=i+1;j<=N;j++){
        if((Asum[j]-Asum[i])%M==0){
    //      System.out.print(i);
    //      System.out.println(j);
          count++;
        }
      }
    }
    System.out.println(count);

  }
}
