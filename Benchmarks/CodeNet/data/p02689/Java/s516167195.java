import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[] h = new int[n];
    int[] GorB = new int[n];
    for(int i = 0;i < n;i++){
      h[i] = sc.nextInt();
    }
    for(int i = 0;i < m;i++){
      int a = sc.nextInt() -1;
      int b = sc.nextInt() -1;
      if(h[a] >= h[b]){
        GorB[b] = 1;
      }
      if(h[a] <= h[b]){
        GorB[a] = 1;
      }
    }
    int count = 0;
    for(int i = 0;i < n;i++){
      if(GorB[i] == 0){
        count++;
      }
    }
    System.out.println(count);
  }
}
