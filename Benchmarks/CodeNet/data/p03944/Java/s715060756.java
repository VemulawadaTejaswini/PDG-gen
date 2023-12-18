import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		int n = sc.nextInt();
		int l = 0;
		int r = w;
		int u = h;
		int d = 0;
		int[] x = new int[n];
		int[] y = new int[n];
		int[] a = new int[n];
		for(int i=0; i<n; i++){
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			a[i] = sc.nextInt();
			if(a[i]==1){if(x[i]>l)l=x[i];}
			else if(a[i]==2){if(x[i]<r)r=x[i];}
			else if(a[i]==3){if(x[i]>d)d=y[i];}
			else {if(x[i]<u)u=y[i];}
		}
		System.out.println(r-l<0 || u-d<0 ? 0 : (r-l)*(u-d));
	}
}