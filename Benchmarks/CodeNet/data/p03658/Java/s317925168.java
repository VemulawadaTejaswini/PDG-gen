import java.util.*;
import java.util.Arrays;


public class Main{
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int [] l = new int[N];
    for(int i=0;i<N;i++){
      l[i] = sc.nextInt();
    }
    Arrays.sort(l);
    int sum =0;
    int count =0;
    int i=0;
    while(count!=K){
      sum +=l[N-i-1];
      i++;
      count++;
    }
    
    System.out.println(sum);
    
    
  }
}
                          
                         
                    
    
    
    
    
    
    
