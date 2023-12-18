import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt(), B = sc.nextInt(), K = sc.nextInt();
    int total = B + 1 - A;
    
    if(total<=K*2) {
      for(int i=A; i<=B; i++) {
      System.out.println(i);
      } 
    } else {
      for(int j=A; j<A+K; j++) {
        System.out.println(j);
      }
      int C = B-K+1;
      for(int k=C; k<C+K; k++) {
        System.out.println(k);
      }
      
    }
  }
}