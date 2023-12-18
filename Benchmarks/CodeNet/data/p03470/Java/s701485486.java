import java.util.*;
 
class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int[] a = new int[n];
    for(int i=0; i<a.length; i++){
      a[i] = sc.nextInt();
    }
    Arrays.sort(a);
    int ans = 1;
    for(int i=0; i<n-1; i++){
      if(a[i] != a[i+1]){
        ans++;
      }
    }
    System.out.println(ans);

    sc.close();
  }
}