import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int k = sc.nextInt();
    int[] a = new int[n];
    
    for(int i=0; i<k; i++){
      int d = sc.nextInt();
      for(int j=0; j<d; j++){
        int x = sc.nextInt()-1;
        a[x]++;
      }
    }
    
    int ans = 0;
    for(int i=0; i<n; i++){
      if(a[i]<=0){
        ans++;
      }
    }
    System.out.println(ans);
  }
}