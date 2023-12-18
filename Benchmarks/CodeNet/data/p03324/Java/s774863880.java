import java.util.*;

public class Main{
  
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    int D = sc.nextInt();
    int N = sc.nextInt();
    int d = (int)Math.pow(100,D);
    
    if(D != 0){
      System.out.println(d*N);  
    }else{
      System.out.println(1*N);  
    }    
  }  
}