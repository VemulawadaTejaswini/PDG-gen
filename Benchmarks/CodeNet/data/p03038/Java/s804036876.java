import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[] a = new int[n];
    long ans = 0;
    
    for(int i = 0; i<n; i++){
      a[i] = sc.nextInt();
    }

    for(int i=0; i<m; i++){
      Sort(a);
      int t = 0;
      int b = sc.nextInt();
      int c = sc.nextInt();
      while(t<b && a[t]<c){
          a[t]=c;
          t++;
      }
    }

    for(int i=0; i<n; i++){
      ans += a[i];
    }
	System.out.println(ans);
  }
  
  public static void Sort(int[] a){
    for(int i=0; i<a.length; i++){
      for(int j=0; j<a.length-1; j++){
        if(a[j]>a[j+1]){
          int tmp = a[j];
          a[j] = a[j+1];
          a[j+1] = tmp;
        }
      }
    }
  }
}