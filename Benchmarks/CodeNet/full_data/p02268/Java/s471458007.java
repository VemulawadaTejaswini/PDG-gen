import java.util.*;
public class Main{
  static boolean BinSearch(int[] a, int key){
    int mid = a.length / 2;
    int upp = a.length - 1;
    int low = 0;
    while(upp-low>=1){
      if(a[mid]==key){
        return true;
      }
      else if(a[mid]>key){
        upp = mid;
        mid = (upp+low) / 2;
      }
      else{
        low = mid;
        mid = (upp+low) / 2;
      }
      if(upp-low==1 && a[upp]!=key && a[low]!=key){
        return false;
      }
    }
    return false;
  }
    
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] s = new int[n];
    for(int i=0; i<n; i++){
      s[i] = sc.nextInt();
    }
    int p = sc.nextInt();
    int[] q = new int[p];
    for(int i=0; i<p; i++){
      q[i] = sc.nextInt();
    }
    int ans = 0;
    for(int i=0; i<p; i++){
      if(BinSearch(s, q[i])==true){
        ans++;
      }
    }
    System.out.println(ans);
  }
}
