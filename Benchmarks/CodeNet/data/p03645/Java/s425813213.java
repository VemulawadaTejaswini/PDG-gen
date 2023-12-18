import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[] a = new int[m];
    int[] b = new int[m];
    int[] start = new int[m];
    int count = 0;
    for(int i = 0;i<m;i++){
      a[i] = sc.nextInt();
      if(a[i] == 1){
        start[count] = i;
        count++;
      }
      b[i] = sc.nextInt();
    }
    boolean ans = false;
    for(int aa:start){
      for(int i = 0;i<m;i++){
        if(b[aa] == a[i]){
          if(b[i] == n)ans=true;
        }
      }
    }
    if(ans){
      System.out.println("POSSIBLE");
    }else{
      System.out.println("IMPOSSIBLE");
    }
  }
}
