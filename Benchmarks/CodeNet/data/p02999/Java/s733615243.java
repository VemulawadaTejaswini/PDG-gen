import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int k = Integer.parseInt(sc.next());
    int[] a = new int[n];

    for(int i=0; i<n; i++){
      a[i] = Integer.parseInt(sc.next());  
    }
    long ans = 0;
    for(int j=0; j<n; j++){
      int res = 0;
      for(int l=j; l<n; l++){
        res += a[l];
	if(res>=k){
	  ans += n-l;
	  break;
	}
      }
    }

    System.out.println(ans);
  }
}