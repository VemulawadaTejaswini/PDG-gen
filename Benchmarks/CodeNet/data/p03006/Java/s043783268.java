import java.util.*;

public class Main {
	public static void main(String[] args) {
		int i,j, k;
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int[] x = new int[n];
		int[] y = new int[n];
		for(i=0;i<n;i++) {
			x[i] = Integer.parseInt(sc.next());
			y[i] = Integer.parseInt(sc.next());
		}
		sc.close();
		int dx,dy, dx1, dy1;
		int max = 1;
		double a;
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				if(i==j)continue;
				dx = x[i]-x[j];
				dy = y[i]-y[j];
				int cnt = 2;
				for(k=0;k<n;k++) {
					if(i==k || j == k)continue;
//					System.out.println(""+x[i]+","+y[i]+":"+x[k]+","+y[k]);
					dx1 = x[i]-x[k];
					dy1 = y[i]-y[k];
//					if(dx1 == 0 || dx==0) {
//						if(dx==dx1) {
//							cnt++;
////							System.out.println(""+x[k]+",0");
//						}
//					} else if(dy1 == 0||dy == 0) {
//						if(dy == dy1) {
//							cnt++;
////							System.out.println("0,"+y[k]);
//						}
//					} else 
						if((long)dx1*dy==(long)dy1*dx) {
						cnt++;
//						System.out.println(""+x[k]+","+y[k]);
					}
				}
				if(cnt > max)max=cnt;
			}
		}
		if(max==n)max--;
//		System.out.println(max);
		System.out.println(n-max);
	}
}
