import java.util.*;
class Test{
  public static void main(String []args){
  	Scanner sr = new Scanner(System.in);
    int n = sr.nextInt();
    int r,s=0;
    while(n>0){
    	r=n%10;
      	s=s+r;
      	n=n/10;
    }
    if(s%9==0)
      System.out.print("Yes");
    else
      System.out.print("No");
  }
}