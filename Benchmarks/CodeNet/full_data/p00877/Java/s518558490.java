import java.util.Scanner;

//Separate Points
public class Main{

	int n, m;
	double delta = 1e-10, EPS = 1e-10;
	double[][] b, w;
	
	boolean isLeft(double[] s, double[] t, double[] r){
		double x1 = t[0]-s[0], y1 = t[1]-s[1], x2 = r[0]-s[0], y2 = r[1]-s[1];
		return x1*y2-x2*y1>0;
	}
	boolean isRight(double[] s, double[] t, double[] r){
		double x1 = t[0]-s[0], y1 = t[1]-s[1], x2 = r[0]-s[0], y2 = r[1]-s[1];
		return x1*y2-x2*y1<0;
	}
	
	boolean div(double[] s, double[] t){
		int br = 0, bl = 0, wr = 0, wl = 0;
		for(int i=0;i<n;i++){
			if(isLeft(s, t, b[i]))bl++;
			if(isRight(s, t, b[i]))br++;
		}
		for(int i=0;i<m;i++){
			if(isLeft(s, t, w[i]))wl++;
			if(isRight(s, t, w[i]))wr++;
		}
//		System.out.println("Black left:"+bl+" White right:"+wr);
//		System.out.println("Black right:"+br+" White left:"+wl);
		if(bl==n&&wr==m||br==n&&wl==m)return true;
		br = bl = wr = wl = 0;
		double[] rs = new double[]{t[0], t[1]};
		double[] rt = new double[]{s[0], s[1]};
		for(int i=0;i<n;i++){
			if(isLeft(rs, rt, b[i]))bl++;
			if(isRight(rs, rt, b[i]))br++;
		}
		for(int i=0;i<m;i++){
			if(isLeft(rs, rt, w[i]))wl++;
			if(isRight(rs, rt, w[i]))wr++;
		}
//		System.out.println("Black left:"+bl+" White right:"+wr);
//		System.out.println("Black right:"+br+" White left:"+wl);
		return bl==n&&wr==m||br==n&&wl==m;
	}
	
	void run(){
		Scanner sc = new Scanner(System.in);
		for(;;){
			n = sc.nextInt(); m = sc.nextInt();
			if((n|m)==0)break;
			b = new double[n][2]; w = new double[m][2];
			for(int i=0;i<n;i++)for(int j=0;j<2;j++)b[i][j]=sc.nextDouble();
			for(int i=0;i<m;i++)for(int j=0;j<2;j++)w[i][j]=sc.nextDouble();
			boolean f = false;
			for(int i=0;i<n;i++)for(int j=i+1;j<n;j++){
				if(f)break;
				if(b[i][0]==b[i][1]){
					double[] s = new double[]{b[i][0]-delta, b[i][1]};
					double[] t = new double[]{b[j][0]-delta, b[j][1]};
					f |= div(s, t);
					continue;
				}
				double[] s = new double[]{b[i][0], b[i][1]-delta};
				double[] t = new double[]{b[j][0], b[j][1]-delta};
				f |= div(s, t);
				s = new double[]{b[i][0], b[i][1]+delta};
				t = new double[]{b[j][0], b[j][1]+delta};
				f |= div(s, t);
			}
			for(int i=0;i<m;i++)for(int j=i+1;j<m;j++){
				if(f)break;
				if(w[i][0]==w[i][1]){
					double[] s = new double[]{w[i][0]-delta, w[i][1]};
					double[] t = new double[]{w[j][0]-delta, w[j][1]};
					f |= div(s, t);
					continue;
				}
				double[] s = new double[]{w[i][0], w[i][1]-delta};
				double[] t = new double[]{w[j][0], w[j][1]-delta};
				f |= div(s, t);
				s = new double[]{w[i][0], w[i][1]+delta};
				t = new double[]{w[j][0], w[j][1]+delta};
				f |= div(s, t);
			}
			for(int i=0;i<n;i++)for(int j=0;j<m;j++){
				double[] mid = new double[]{(b[i][0]+w[j][0])/2, (b[i][1]+w[j][1])/2};
				double x = b[i][0]-w[j][0], y = b[i][1]-w[j][1];
				double dx = -y, dy = x;
				double[] t = new double[]{mid[0]+dx, mid[1]+dy};
				f |= div(mid, t);
				t = new double[]{mid[0]-dx, mid[1]-dy};
				f |= div(mid, t);
				if(f)break;
			}
			System.out.println(f?"YES":"NO");
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}