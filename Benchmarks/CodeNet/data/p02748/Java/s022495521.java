import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int M = sc.nextInt();
    
    int a[] = new int[A];
    int b[] = new int[B];
    
    int a_min = 1000000;
    int a_min_num =0;
    int b_min = 1000000;
    int b_min_num =0;
    
    int result = 0;
    int sum = 0;
    
    for(int i = 0 ; i < A ; ++i){
      a[i] = sc.nextInt();
      if(a_min > a[i]){
        a_min = a[i];
        a_min_num = i;
        
      } 
    }
    
    for(int i = 0 ; i < B ; ++i){
      b[i] = sc.nextInt();
      if(b_min > b[i]){
        b_min = b[i];
        b_min_num = i;
        
      } 
    }

    
    for(int i = 0 ; i < M ; ++i){
      result = a[sc.nextInt()-1] + b[sc.nextInt()-1] - (sc.nextInt());
      if(sum == 0){
        sum = result;
      }else if(sum > result){
        sum = result;
      }
    }
    
    int min_sum = a[a_min_num] + b[b_min_num];
    
    if(min_sum <= sum){
      System.out.println(min_sum);
    }else{
      System.out.println(sum);
    }
  }
}

