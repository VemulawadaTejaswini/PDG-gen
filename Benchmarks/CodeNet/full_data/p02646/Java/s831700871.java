import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int A = scanner.nextInt();
    int V = scanner.nextInt();
    int B = scanner.nextInt();
    int W = scanner.nextInt();
    int T = scanner.nextInt();

    for(int i =0 ; i<T; i++){
      if(A==B){
        System.out.println("YES");
        scanner.close();
        return;
      }
      else if(A < B){
        A += V;
        B += W;
      }else{
        A -= W;
        B -= W;
      }
      if(B > Math.pow(10,9)){
        B = (int)Math.pow(10,9) - (B - (int)Math.pow(10,9));
      }
      if(A > Math.pow(10,9)){
        A = (int)Math.pow(10,9) - (A - (int)Math.pow(10,9));
      }
      if(B < - Math.pow(10,9)){
        B = - (int)Math.pow(10,9) - (B + (int)Math.pow(10,9));
      }
      if(B > Math.pow(10,9)){
        B = - (int)Math.pow(10,9) -(B + (int)Math.pow(10,9));
      }
    }
    
    if(A==B){
      System.out.println("YES");
      scanner.close();
      return;
    }
    System.out.println("NO");
    scanner.close();
    return;

  }
}