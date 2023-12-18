import java.util.*;
import java.util.Arrays;


public class Main{
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int x = sc.nextInt();
    int [] a = new int[N];
    for(int i=0;i<N;i++){
      a[i] = sc.nextInt();
    }
    Arrays.sort(a);
    int ans = 0;
    int i=0;
    while(x!=0){
      x = x-a[i];
      if(x<=0){
        break;
      }
      x = x-a[i];
      ans++;
      i++;

    }
    System.out.println(ans);
    
    
  }
}
                          
                         
                    
    
    
    
    
    
    
