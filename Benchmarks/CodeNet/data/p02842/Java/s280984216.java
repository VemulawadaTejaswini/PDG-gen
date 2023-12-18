import java.util.*;
public class Main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    double X=N/1.08;
    double XX=Math.floor(X);
    if(X==XX){
      System.out.println("X");
    }else if(X!=XX){
      System.out.println(":(");
    }
  }
}
