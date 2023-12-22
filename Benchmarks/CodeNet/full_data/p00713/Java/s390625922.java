import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			while(sc.hasNext()) {
				int n=sc.nextInt();
				if(n==0) break;
				double[] x=new double[n+1];
				double[] y=new double[n+1];
				for(int i=0; i<n; i++) {
					x[i]=sc.nextDouble();
					y[i]=sc.nextDouble();
				}
				int count=0;
				int max=1;
				for(int i=0; i<n; i++) {
					for(int j=i+1; j<n; j++) {
						double d=Math.sqrt((x[j]-x[i])*(x[j]-x[i])+(y[j]-y[i])*(y[j]-y[i]));
						
						if(d<=2.0) {
							double cx=(x[i]+x[j])/2.0;//2点の真ん中
							double cy=(y[i]+y[j])/2.0;
							double vx=(y[j]-y[i])/d;//法線ベクトルの単位ベクトル
							double vy=-((x[j]-x[i])/d);
							double e=Math.sqrt(1.0-d*d/4.0);//交点cx,cyから中心までの距離
							
							double px=cx+e*vx;//中心座標(円1) 
							double py=cy+e*vy;
							for(int k=0; k<n; k++) {
								if(k==i || k==j || Math.sqrt((x[k]-px)*(x[k]-px)+(y[k]-py)*(y[k]-py))<=1.0) {
									count++;
								}
							}
							max=Math.max(count, max);
							count=0;
							
							px=cx-e*vx;//(円2)
							py=cy-e*vy;
							for(int k=0; k<n; k++) {
								if(k==i || k==j || Math.sqrt((x[k]-px)*(x[k]-px)+(y[k]-py)*(y[k]-py))<=1.0000) {
									count++;
								}
							}
							max=Math.max(count, max);
							count=0;
						}
						
					}
				}
				System.out.println(max);
			}
		}
	}
}
