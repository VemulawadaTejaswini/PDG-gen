import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();

    int a[] =new int[m];
    int b[] =new int[m];
    int st = 0;
    int en = 0;
    boolean ju = false;
    
    for(int i = 0 ; i < m ; ++i){
      a[i] = sc.nextInt();
      b[i] = sc.nextInt();
    }
    for(int i = 0 ; i < m ; ++i){
      if(b[i]==n){
        ju = true;
        break;
      }
    }
    
    if(ju==false){
      System.out.println("IMPOSSIBLE");
      return;
    }
    
    ju = false;
    
    for(int i = 0 ; i < m ; ++i){
      if(b[i]==n){
        int mid = a[i];
      
      for(int j = 0 ; j < m ; ++j){
        if(mid == b[j] && a[j] == 1){
          ju = true;
          break;
        }
      }
      }
    }
    
    if(ju) System.out.println("POSSIBLE");
    else System.out.println("IMPOSSIBLE");

  }
}