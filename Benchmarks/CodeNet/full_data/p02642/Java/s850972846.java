import java.util.*;
public class Main{
  public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int[] list = new int[n];
    
    for(int i = 0; i < n; i++){
      list[i] = sc.nextInt();
    }

    int ans = 0;
    
    Arrays.sort(list);
    
    for(int i = 0; i < n; i++){
      boolean ansFlg = true;
      if(i < n-1){
        if(list[i]%list[i+1]==0){
          ansFlg = false;
        }
      }
      for(int j = 0; j < i; j++){
        if(list[i]%list[j]==0){
          ansFlg = false;
        }
      }
      if(ansFlg){
        ans++;
      }
    }
    
    System.out.println(ans);

  }
}