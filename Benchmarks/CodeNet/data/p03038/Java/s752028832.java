import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[] a = new int[n];
    int[] b = new int[m];
    int[] c = new int[m];
    int ans = 0;
    
    for(int i = 0; i<n; i++){
      a[i] = sc.nextInt();
    }

    for(int i=0; i<m; i++){
      int t = 0;
      Sort(a);
      b[i] = sc.nextInt();
      c[i] = sc.nextInt();
      while(t<b[i] && a[t]<c[i]){
        a[t]=c[i];
        t++;
      }
    }
    
    for(int i=0; i<n; i++){
		ans += a[i];
    }
	System.out.println(ans);
  }
  
  public static void Sort(int[] a){
    for(int j=0; j<a.length; j++){
      for(int i=1; i<a.length; i++){
        if(a[i-1]>a[i]){
          int tmp = a[i-1];
          a[i-1] = a[i];
          a[i] = tmp;
        }
      }
    }
  }
}