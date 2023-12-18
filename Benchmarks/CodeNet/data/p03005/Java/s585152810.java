import java.util.*;
 
public class Main {
  public static void main(final String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt(); 
    
    if(K==1){
      System.out.println(0);
    }else{
      System.out.println(N-K);
    }
  }
}