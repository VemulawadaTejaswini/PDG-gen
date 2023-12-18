import java.util.*;
class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int[] param = new int[n];
    
    int max = 0;
    int min = 10*9;
    
    for(int i=0 ; i<n ; i++){
      param[i] = sc.nextInt();
    }
    
    //最大値を見つける
    for(int i=0 ; i<n ; i++){
      
      if(param[i]>=max){ 
        max = param[i];
      }
    }
    
    //最小値を見つける
    for(int i=0 ; i<n ; i++){
      
      if(param[i]<=min){
        min = param[i];
      }
    }
    
    int abs = max-min;
    System.out.println(abs);
  }
}