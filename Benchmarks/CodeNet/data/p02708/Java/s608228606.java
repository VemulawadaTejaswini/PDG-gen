import java.util.*;
class Main{
  public static void main(String[] args) {
    Scanner reader=new Scanner(System.in);
    int N=reader.nextInt();
    int K=reader.nextInt();
    int sum=0;
    final int INF =(int)Math.pow(10, 9) + 7;
    for(int i=K;i<=N+1;i++)
    {
      sum+=i*N-i*(i-1)+1;
    }
    System.out.println(sum%INF);
  }
}
