import java.util.*;
import java.lang.Math;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n];
    int ans;
    double ave = 0;
    double diff;
   	double stack;
    
    for(int i = 0;i < n;i++){
      a[i] = sc.nextInt();
      ave += a[i];
    }
    
    ave /= n;
    diff = Math.abs(a[n-1] - ave);
    ans = n-1;
    
    for(int i = n-2;i > -1;i--){
      stack = Math.abs(a[i] - ave);
      if(stack <= diff){
        diff = stack;
        ans = i;
      }
    }
    
    System.out.println(ans);
    
  
  }
}
