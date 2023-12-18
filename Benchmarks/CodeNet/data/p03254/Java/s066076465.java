import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = sc.nextInt();

    boolean j = false;
    int ans = 0;
    
    int a[] = new int[n];
    for(int i = 0; i < n; ++i){
      a[i] = sc.nextInt();
    }

    Arrays.sort(a);
    
    for(int i = 0; i < n; ++i){
	  if(a[i] <= x ){
        x -= a[i];
        ans++;
        
      }else if(a[i] > x){
        j = true;
        break;
      }
    }
    
    if(x > 0 && j){
      System.out.println(ans);
    }else{
      System.out.println(ans-1);
    }

        
  }
}