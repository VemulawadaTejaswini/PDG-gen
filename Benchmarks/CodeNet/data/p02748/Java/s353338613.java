import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int M = sc.nextInt();
    
    int a[] = new int[A];
    int b[] = new int[B];
    
    int a_min = 100000;
    int b_min = 100000;

    
    int result = 0;
    int sum = 0;
    
    for(int i = 0 ; i < A ; ++i){
      a[i] = sc.nextInt();
      if(a_min > a[i]){
        a_min = a[i];
      } 
    }
    
    for(int i = 0 ; i < B ; ++i){
      b[i] = sc.nextInt();
      if(b_min > b[i]){
        b_min = b[i];
      } 
    }
    
    int min_sum = a_min + b_min;   

    for(int i = 0 ; i < M ; ++i){
      result = a[sc.nextInt()-1] + b[sc.nextInt()-1] - (sc.nextInt());
      sum = Math.min(min_sum,result);
    }

    System.out.println(sum);

  }
}

