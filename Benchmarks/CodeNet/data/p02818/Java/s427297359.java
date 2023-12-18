import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int K = sc.nextInt();
    
    int i;
    
    for(i=0; i<K; i++) {
      if (A>0){
        A--;
      }
      else if (B>0) {
        B--;
      }
    }
    
    System.out.println(A+ " " + B);
  }
}