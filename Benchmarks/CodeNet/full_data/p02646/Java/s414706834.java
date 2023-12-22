import java.util.*;

public class Main{
	
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	long a=sc.nextLong(),v=sc.nextLong(),b=sc.nextLong(),w=sc.nextLong(),t=sc.nextLong();
    long g=0;
    fot(long i=1;i<=t;i++){
      ai=a+v*i;
      bi=b+w*i;
      if(ai==bi){
        System.out.println("YES");
        g++;
        break;
      }
    }
    if(g==0){
      System.out.println("NO");
    }
    
  }
}
