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
    for(int i=1; i<n; i++){
      int j=i;
      int m=0;
      while(j<n && h[j-1]>=h[j]){
        m++;
        j++;
      }
      if(ans<m){
        ans=m;
      }
    }
    System.out.println(ans);
  }
}