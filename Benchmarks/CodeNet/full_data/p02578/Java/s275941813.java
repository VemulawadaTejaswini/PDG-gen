import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
	
    int n = sc.nextInt();
    int[] a = new int[n];
    int[] x = new int[n];
    int ans = 0;
    for(int i=0; i<n; i++){
      a[i] = sc.nextInt();
    }
    x[0] = a[0];
    for(int i=1; i<n; i++){
      int y = a[i]-x[i-1];
      if(y<=0){
        x[i] = a[i]; 
      }
      else{
        x[i] = a[i]+Math.abs(y);
        ans += y;
      }
    }
    System.out.println(ans);
  }
}