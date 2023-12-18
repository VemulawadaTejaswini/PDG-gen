import java.util.Scanner;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n+1];
    int[] b = new int[n]; 
    int ans = 0;
    for(int i = 0;i < n + 1;i++){
      a[i] = sc.nextInt();
    }
    for(int j = 0;j < n;j++){
      b[j] = sc.nextInt();
    }
    for(int x = 0;x < n;x++){
      if(a[x] <= b[x]){
        b[x] -= a[x];
        ans += a[x];
        a[x] = 0;
      }else{
        a[x] -= b[x];
        ans += b[x];
        b[x] = 0;
      }
    }
    for(int y = 0;y < n;y++){
      if(a[y+1] <= b[y]){
        b[y] -= a[y+1];
        ans += a[y+1];
        a[y+1] = 0;
      }else{
        a[y+1] -= b[y];
        ans += b[y];
        b[y] = 0;
      }
    }
    System.out.println(ans);
  }
}