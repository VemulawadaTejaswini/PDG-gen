import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int X = sc.nextInt();
    if(A+B<X){
      System.out.print("NO");
    }else if(A<=X){
      System.out.print("YES");
    }else{
      System.out.print("NO");
    }
    
  }
  

  
}
