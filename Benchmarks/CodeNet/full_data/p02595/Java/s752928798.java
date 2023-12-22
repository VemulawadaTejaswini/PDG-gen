import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int d = sc.nextInt();
    int x;
    int y;
    
    int count = 0;
    
    for(int i = 0 ; i < n ; ++i){
      x = sc.nextInt();
      y = sc.nextInt();
      
      double num = Math.sqrt(x*x + y*y);
      
      if(num <= d){
        count++;
      }
    }
    
    System.out.println(count);
    
  }
}