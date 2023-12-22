import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    long X=sc.nextLong();
    long K=sc.nextLong();
    long D=sc.nextLong();
    long div=0;
    long num=0;
    long ndiv=0;
    if(X>0){
    div=(long)Math.ceil
    ((double)X/(double)D);
    ndiv=Math.min(div,K);
    num=X-D*ndiv;
    }
    else if(X<0)
    {
      div=(long)Math.ceil
    ((double)Math.abs(X)/(double)D);
    ndiv=Math.min(div,K);
    num=X+D*ndiv;
    }
    K-=ndiv;
    long ans=0;
    if(K%2==0)
    {
      ans=Math.abs(num);
    }
    else
    {
      ans=Math.abs(num+D);
    }
    System.out.println(ans);
  }
}