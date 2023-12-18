import java.util.*;
 
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int a[] = new int[N];
    int ans = 0;
    for(int i = 0;i < N;i++){
      a[sc.nextInt()]++;
    }
    for(int i = 1;i < N;i++){
      if(a[i] > i){
        ans += a[i] - i;
      }else if(a[i] < i){
        ans += a[i];
      }
    }
    System.out.println(ans);
  }
}