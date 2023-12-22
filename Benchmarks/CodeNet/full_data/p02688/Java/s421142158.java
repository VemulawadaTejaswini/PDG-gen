import java.util.*;
public class Main{
  public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int k = sc.nextInt();
    
    boolean[] list = new boolean[n];
    
    int ans = n;
     
	for (int i = 0; i < k; i++){
      int d = sc.nextInt();
      for (int j = 0; j < d; j++){
        int a = sc.nextInt();
        if(!(list[a-1])){
          list[a-1] = true;
          ans--;
        }
      }
    }
    
    System.out.println(ans);
  }
}