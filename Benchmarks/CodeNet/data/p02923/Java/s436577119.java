import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int[] h = new int[n];
    for(int i=0; i<n; i++){
      h[i] = sc.nextInt();
    }
    
    int ans = 0;
    int m = 0;
    for(int i=0; i<n-1; i++){
      for(int j=i; j<n-1; j++){
        if(h[j]>h[j+1]){
          m++;
        }
        else{
          break;
        }
      }
      if(ans<m){
        ans=m;
      }
      m=0;
    }
    System.out.println(ans);
  }
}