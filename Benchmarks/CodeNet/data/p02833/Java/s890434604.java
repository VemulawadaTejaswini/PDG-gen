import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    long N=sc.nextLong();
    long Ans=0L;
    
    if(N%2==1){
    }else{
      for(int i=1;i<=19;i++){
        Ans=Ans+(long)Math.floor(N/Math.pow(10,i));
      }
    }
    
    System.out.println(Ans);
    
  }
}
