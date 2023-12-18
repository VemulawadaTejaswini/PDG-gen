import java.util.Scanner;
 
public class Main {
  
  public static void main()  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int A[] = new int[100000];
    int B[] = new int[100000];
    
    int tVil = 0;
    for(int i = 0; i <= n; i++) {
      A[i] = sc.nextInt();
      tVil += A[i];
    }
    for(int i = 0; i < n; i++) {
      B[i] = sc.nextInt();
    }
    
    /*for(int i = 0; i < n; i++) {
      tVil = tVil - A[i];
      int remPower = B[i]-A[i];
      A[i+1] = A[i+1] - remPower;
      if(A[i+1] < 0) A[i+1] = 0;
      else {
        tVil = tVil - remPower;
      }
    }
    System.out.println(tVil);*/
    
  }
}