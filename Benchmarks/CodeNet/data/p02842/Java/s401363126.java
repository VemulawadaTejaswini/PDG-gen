import java.util.*;
public class Main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    double X;
    double X1;
    int N=sc.nextInt();
     X=Math.floor(N/1.07);
     X1=Math.floor(X*1.08);
    if(N!=X1){
      System.out.println("X");
    }else if(N!=X1){
      System.out.println(":(");
    }
  }
}
