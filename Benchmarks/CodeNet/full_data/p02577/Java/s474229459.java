import java.util.*;
public class solution{
  public static void main(String args[]){
    Scanner s= new Scanner(System.in);
    int n=s.nextInt();
    int sum=0;
    while(n>0){
      rem=n%10;
      sum=sum+rem;
      n=m/10;
    }
    if(sum%9==0){
      System.out.println("Yes");
    }
    else{
      println("No");
    }
  }
}