import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int h[] = new int[n];
    int tmp =0;
    for(int i=0;i<n;i++){
      h[i] = sc.nextInt();
    }
    int cnt[] = new int[n];
    cnt[n-1]=0;
    for(int i=n-1;i>0;i--){
      if(h[i]<=h[i-1]){
        tmp=tmp+1;
        cnt[i-1]=tmp;
      }else{
        tmp=0;
        cnt[i-1]=0;
      }
    }
    Arrays.sort(cnt);
    System.out.print(cnt[n-1]);
  }
}