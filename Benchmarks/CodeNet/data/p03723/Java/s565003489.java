import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int counter = 0;
    
    if(A==B && B==C){
      System.out.println(-1);
    } else {
      while(A%2==0 && B%2==0 && C%2==0) {
        counter++;
        int a = B / 2 + C / 2;
        int b = C / 2 + A / 2;
        int c = A / 2 + B / 2;
        
        A = a;
        B = b;
        C = c;
      }
      System.out.println(counter);
    }
  }
}