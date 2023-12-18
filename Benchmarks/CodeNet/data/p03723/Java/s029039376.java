import java.util.*;

public class Main{
	
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	long a=sc.nextLong(),b=sc.nextLong(),c=sc.nextLong();
    long f=0;
    if((a%2!=0||b%2!=0||c%2!=0)&&(a==b&&b==c)){
      System.out.println(-1);
    }else{
      while(true){
        if(a%2!=0||b%2!=0||c%2!=0){
          break;
        }else{
          long ha=a/2,hb=b/2,hc=c/2;
          a=hb+hc;
          b=ha+hc;
          c=ha+hb;
          f++;
        }
      }
      System.out.println(f);
    }
  }
}
