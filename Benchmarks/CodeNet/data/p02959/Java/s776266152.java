import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n+1];
    int b[] = new int[n];
    int count = 0;
    for(int i=0 ; i<n+1 ; i++){
      a[i] = sc.nextInt();
    }
    for(int i=0 ; i<n ; i++){
      b[i] = sc.nextInt();
    }
    for(int i=0 ; i<n ; i++){
      if(a[i]>=b[i]){
        count = count + b[i];
      }else{
        int x = a[i+1] - (b[i]-a[i]);
        if(x>=0){
          count = count + b[i];
        }else{
          count = count + a[i]+a[i+1];
        }
        a[i+1] = a[i+1] - (b[i]-a[i]);
      }
    }
    System.out.println(count);
  }
}
