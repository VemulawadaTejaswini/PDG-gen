import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    long X=scan.nextLong(), K=scan.nextLong(), D=scan.nextLong();
    long min=-K*D+X,tmp;
    if(min>=0)System.out.println(""+(D-K*X));
    else{
      tmp=(-1*min)/(2*D);
      if(tmp>K)System.out.println(""+(D+(2*D-X)*K));
      else{
        min=min+2*D*tmp;
        if(-min>min+2*D)min+=2*D;
        System.out.println("" + min);
      }
    }
  }
  
}