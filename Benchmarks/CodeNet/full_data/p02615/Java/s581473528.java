import java.util.*;

public class Main{
	public static void main(String args[]){
    	Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      
      int[] a = new int[n];
      for(int i=0; i<n; i++){
      	a[i] = sc.nextInt();
      }
      
      Arrays.sort(a);
      
      int r=0;
      
      int i =0;
      int cnt = 1;
      for(i = n-2; i >= 0; i--){
        if(a[i] == a[i+1]){
          r += a[i+1];
          cnt++;
        } else {
          
          break;
        }
      }
      
      for(; i >= 0; i--){
        if (cnt > 0){
          cnt--;
          r += a[n-1];
        } else if(a[i+2] == a[i+1]){
          r += a[i+1];
        } else {
          r += a[i+1];
        }
      }
      
      
      	System.out.println(r);
    }
}
