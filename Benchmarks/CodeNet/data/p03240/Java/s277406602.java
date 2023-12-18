import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] x = new int[n];
      int[] y = new int[n];
      int[] h = new int[n];
      int X = 0;
      int Y = 0;
      int H = 0;
      for(int i = 0;i < n;i++){
      	x[i]=sc.nextInt();
        y[i]=sc.nextInt();
        h[i]=sc.nextInt();
      }
      for(int i = 0;i < n;i++)
        if(h[i]!=0){
          X = x[i];
          Y = y[i];
          H = h[i];
          break;
        }
      for(int cx = 0;cx <= 100;cx++){
      	for(int cy = 0;cy <= 100;cy++){
          boolean cnt = true;
          for(int i = 0;i < n;i++){
          	if(H+Math.abs(X-cx)+Math.abs(Y-cy)!=(h[i]+Math.abs(x[i]-cx)+Math.abs(y[i]-cy)))cnt = false;
          }
          if(cnt){
          	System.out.println(cx+" "+cy+" "+(H+Math.abs(X-cx)+Math.abs(Y-cy)));
            return;
          }
        }
      }
    }
}