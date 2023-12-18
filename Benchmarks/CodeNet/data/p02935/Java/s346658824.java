import java.util.*;

/**
 * @author masayamatu
 * 
 */
public class Main {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    double[] A= new double[n];
    for(int i = 0; i < n; i++) {
     A[i] = sc.nextDouble();
    }
    Arrays.sort(A);
    for(int i = 0 ; i < n-1; i++ ) {
      A[i+1] = (double)(A[i+1]+A[i])/2;
    }
    System.out.println(A[n-1]);
  }  
}