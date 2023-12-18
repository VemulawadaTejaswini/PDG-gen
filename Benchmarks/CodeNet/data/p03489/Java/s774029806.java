import java.util.*;
 
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int a[] = new int[10001];
    int ans = 0;
    for(int i = 0;i < N;i++){
      if(sc.nextInt() <= 10000){
        a[sc.nextInt()]++;
      }else{
        a[0]++;
      }
    }
    for(int i = 1;i < N;i++){
      if(a[i] > i){
        ans += a[i] - i;
      }else if(a[i] < i){
        ans += a[i];
      }
    }
    ans += a[0];
    System.out.println(ans);
  }
}