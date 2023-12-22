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
    boolean[] flgList = new boolean[n];
    
    for(int i = 0; i < n; i++){
      if(!flgList[i] && i!=n-1){
        for(int j = i+1; j < n; j++){
          if(list[j]==list[i]){
            flgList[i] = true;
            flgList[j] = true;
          }
          if(!flgList[j]){
            if(list[j]%list[i]==0){
              flgList[j] = true;
            }
          }
        }
      }
    }
    
    for(int i = 0; i < n; i++){
      if(!flgList[i]){
        ans++;
      }
    }
    
    System.out.println(ans);

  }
}