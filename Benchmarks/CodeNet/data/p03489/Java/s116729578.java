import java.util.*;
 
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int a[] = new int[100001];
    int ans = 0;
    for(int i = 1;i <= N;i++){
      int num = sc.nextInt();
      if(num <= 100000){
        a[num]++;
      }else{
        a[0]++;
      }
    }
    for(int i = 0;i <= N;i++){
      if(a[i] > i){
        ans += a[i] - i;
      }else if(a[i] < i){
        ans += a[i];
      }
    }
    System.out.println(ans);
  }
}