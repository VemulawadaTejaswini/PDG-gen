import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int cnt;
    int max = 0;
    int n = sc.nextInt();
    int[] h = new int[n];
    for(int i = 0; i < h.length; i++){
      h[i] = sc.nextInt();
    }
    for(int i = 0; i < h.length - 1; i++){
      cnt = 0;
      for(int j = i + 1; j < h.length; j++){
        if(h[j-1] >= h[j]){
          cnt++;
        }else{
          if(max <= cnt){
            max = cnt;
          }
          break;
        }
      }
    }
    System.out.println(max);
  }
}