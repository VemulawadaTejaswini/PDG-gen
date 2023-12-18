import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;
 
public class Main {
  public static void main (String[] arg) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int K = scan.nextInt();
    int A[] = new int[N];
    int Asum = 0;
    int a[] = new int[N];
    int ad[] = new int[N];
    List<Integer> x = new ArrayList<>();
    int result = 0;
    
    
    for(int i = 0; i < N; i++){
      A[i] = scan.nextInt();
      Asum += A[i];
    }
    x.add(Asum);
    for(int i = Asum/2; i >= 1; i--){
      if(Asum%i == 0){
        x.add(i);
      }
    }
    
    int[] X = new int[x.size()];
    for(int i = 0; i < x.size(); i++){
      X[i] = x.get(i);
    }
    
    Arrays.sort(X);
    
    for(int i = x.size()-1; i >= 0; i--){
      
    int asum = 0;
    int adsum = 0;
      
      for(int j = 0; j < N; j++){
        a[j] = A[j]%X[i];
        ad[j] = A[j]/X[i];
        asum += a[j];
        adsum += ad[j];
      }
      
      Arrays.sort(a);
      
      int asub = 0;
      int Kcount = 0;
      
      Ask_K: for(int j = N-1; j > 0; j--){
        asub += a[j];
        while(a[j] <= X[i]){

          if(asub+Kcount >= Asum-adsum*X[i]){
            break Ask_K;
          }
                    a[j]++;
          Kcount++;
        }
      }
      if(Kcount <= K){
        result = X[i];
        break;
     }
    }
    
    System.out.println(result);
    
  }
}