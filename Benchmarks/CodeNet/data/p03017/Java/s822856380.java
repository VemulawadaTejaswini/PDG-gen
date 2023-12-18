import java.util.*;
 
public class Main {
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);    
    int N = sc.nextInt();
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int D = sc.nextInt();
    String S = sc.next();
    
    if(S.contains("##")){     
      System.out.println("No");
    } 
    else if (B<C && C<D){
      System.out.println("Yes");
    }
    else if (C<B && B<D){
      System.out.println("Yes");
    }
    else if (B<D && D<C){
      if(S.substring(B-1, D+1).contains("...")){
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
   
    }
    
  }
 
}
