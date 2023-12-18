import java.util.*;
public class Main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    double X=N/1.08;
    double X1=X*1.08;
    
    if(X==X1){
      System.out.println("X");
    }else if(X!=X1){
      System.out.println(":(");
    }
  }
}
