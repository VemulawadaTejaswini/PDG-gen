import java.util.*;
public class Main{
  public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int k = sc.nextInt();
    
    //expectation list
    double[] list = new double[n];
    
    for(int i = 0; i < n; i++){
      double d = sc.nextDouble();
      list[i] = d/2+0.5;
    }
   
    double max = 0;
    int x = n-k+1;

    for(int i = 0; i < x; i++){
      double sum = 0;
      if(i!=0){
        if(list[i-1]<list[i+k-1]){
          for(int j = i; j < i+k; j++){
            sum += list[j];
          }
        }
      }
      if(max < sum){
        max = sum;
      }
    }
    
    System.out.println(max);
    
  }
}