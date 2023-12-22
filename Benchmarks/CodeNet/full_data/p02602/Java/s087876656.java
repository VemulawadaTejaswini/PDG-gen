import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int a[] = new int[n];
    for(int i = 0 ; i < n ; ++i){
      a[i] = sc.nextInt();
    }
    
    
    for(int i = 0 ; i < n-k ; ++i){
      long num1 = 1;
      long num2 = 1;
      for(int j = i ; j < k+i ; ++j){
        num1 *= a[j];
        num2 *= a[j+1];
        
      }
      
      if(num1 < num2){
        System.out.println("Yes");
      }else{
        System.out.println("No");
      }
    }
    
  }
}