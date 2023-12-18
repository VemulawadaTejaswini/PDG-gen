import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int w = sc.nextInt();
      int h = sc.nextInt();
      int n = sc.nextInt();
      int x1 = 0;
      int x2 = w;
      int y1 = 0;
      int y2 = h;
      int[] x = new int[n];
      int[] y = new int[n];
      int[] a = new int[n];
      for(int i = 0;i < n;i++){
      	x[i] = sc.nextInt();
        y[i] = sc.nextInt();
        a[i] = sc.nextInt();
        if(a[i]==1) x1 = Math.max(x[i],x1);
        else if(a[i]==2) x2 = Math.min(x[i],x2);
        else if(a[i]==3) y1 = Math.max(y[i],y1);
        else if(a[i]==4) y2 = Math.min(y[i],y2);
      }
      if(x1 < x2 && y1 < y2)System.out.println((x2-x1)*(y2-y1));
      else System.out.println(0);
    }
}