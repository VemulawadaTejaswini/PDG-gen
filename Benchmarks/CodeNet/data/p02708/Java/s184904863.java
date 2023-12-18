import java.util.*;
class Main{
  public static void main(String[] args) {
    Scanner reader=new Scanner(System.in);
    long N=reader.nextLong();
    long K=reader.nextLong();
    long sum=0;
    final Long INF =(long)Math.pow(10, 9) + 7;
    for(long i=K;i<=N+1;i++)
    {
      sum+=(i*(N-i+1)+1);
      
    }
System.out.println(sum%INF);
  }
}
