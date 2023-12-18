import java.util.*;
public class Main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    double X=N/1.08;
    double X1=X*1.08;
    double XX=Math.floor(X);
    double XX1=Math.floor(X1);
    if(XX==XX1){
      System.out.println("X");
    }else if(XX!=XX1){
      System.out.println(":(");
    }
  }
}
