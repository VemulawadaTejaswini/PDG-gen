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
  
    double ans = 0;
    for(int i = 0; i < n; i++) {
      A[i] = sc.nextInt();
    }
    Arrays.sort(A);
    
    Arrays.sort(A);
    ans = gou(A);

    System.out.println(ans);
  }    
  public static double gou(double[] A) {
      int j = 0;
      double result = 0;
      if(A.length > 2 && A.length % 2 == 1) {
        double[] B = new double[(int) (Math.floor(A.length/2)+1)];
        for(int i = 0; i < A.length-1; i += 2) {
          B[j] = (A[i]+A[i+1])/2;
          j++;
          if(i+1 == A.length-2) {
            B[A.length-2] = A[A.length-1];
          }     
        }
        gou(B);
        result = gou(B);
        return result;
      }else if(A.length > 2 && A.length % 2==0) {
        double[] B = new double[A.length/2];
        for(int i = 0; i <= A.length-1; i += 2) {
          B[j] = (A[i]+A[i+1])/2;
          j++;
        }
        gou(B);
        result = gou(B);
        return result;
      }
      result =(double)(A[0] + A[1])/2;
      return result;   
    }
}