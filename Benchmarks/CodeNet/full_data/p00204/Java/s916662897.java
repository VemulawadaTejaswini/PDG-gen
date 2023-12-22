import java.util.Scanner;

//UFO Shooting Down Operation
public class Main{

	double dot(double[] a, double[] b){
		return a[0]*b[0]+a[1]*b[1];
	}
	
	void run(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int R = sc.nextInt();
			int n = sc.nextInt();
			if((R|n)==0)break;
			int[][] ufo = new int[n][4];
			for(int i=0;i<n;i++)for(int j=0;j<4;j++)ufo[i][j]=sc.nextInt();
			double[] dist = new double[n];
			for(int i=0;i<n;i++)dist[i]=Math.hypot(ufo[i][0], ufo[i][1])-ufo[i][3];
			boolean[] u = new boolean[n];
			int c = 0;
			while(true){
				double min = 1<<20;
				int id = -1;
				for(int i=0;i<n;i++){
					if(u[i])continue;
					if(dist[i]<=R){
						u[i] = true;
						c++;
					}
					else if(dist[i]<min){
						min = dist[i];
						id = i;
					}
				}
				if(id==-1)break;
				double[] p = {ufo[id][0], ufo[id][1]};
				for(int i=0;i<n;i++){
					if(u[i])continue;
					dist[i]-=ufo[i][3];
					double[] ci = {ufo[i][0], ufo[i][1]};
					double A = dot(p, p);
					double B = -2*dot(p, ci);
					double C = dot(ci, ci)-ufo[i][2]*ufo[i][2];
					double D = B*B-4*A*C;
					if(D>=0)u[i] = true;
				}
			}
			System.out.println(c);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}