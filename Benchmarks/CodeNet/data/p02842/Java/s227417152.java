import java.util.*;
public class Main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    double X;
    double X1;
    double N=sc.nextInt();
     X=N/1.08;
     X1=X*1.08;
    double X2=Math.floor(X);
    double X3=Math.floor(X)*1.08;
    double X4=Math.floor(X3);
    
    if(N==X4){
      System.out.println("X");
    }else{
      System.out.println(":(");
    }
  }
}
