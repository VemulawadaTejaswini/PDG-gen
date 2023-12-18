import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    
    Scanner scanner = new Scanner(System.in);
    int A = scanner.nextInt();
    int B = scanner.nextInt();
    int C = scanner.nextInt();
    int D = scanner.nextInt();
    
    double X = Math.ceil(C/B);
    double Y = Math.ceil(A/D);
    
    if(X >= Y){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}

    
    
