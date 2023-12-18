import java.util.Scanner;

public class Main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    long a=sc.nextLong();
    long b=sc.nextLong();
    long c=sc.nextLong();
    long d=sc.nextLong();
    long coc=0;
    long cod=0;
    long cocd=0;
    long min=0;
    //cとdの最小公倍数
    for(long k=c-1;k>0;k--){
      if(c%k==0 && d%k==0){
        min=k;
        break;
      }
    }
    long smin;
    smin=c*d/min;
    coc=(long)b/c-(long)((a-1)/c);
    cod=(long)b/d-(long)((a-1)/d);
    cocd=(long)b/smin-(long)a/smin;
    System.out.println(b-a+1-(coc+cod-cocd));


  }
}