import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    long x=sc.nextLong();
    long twi=x/11;
    x-=11*twi;
    long ans=twi*2;
    if(x>6){
      ans+=2;
    }else if(x>0){
      ans++;
    }
    System.out.println(ans);
  }
}