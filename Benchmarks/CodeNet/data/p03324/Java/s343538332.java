import java.util.*;

public class Main{
  
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    int D = sc.nextInt();
    int N = sc.nextInt();
    
    if(D != 0){
      int d = (int)Math.pow(100,D);
      System.out.println(d*N);  
      
    }else{
      System.out.println(N);  
    }    
  }  
}