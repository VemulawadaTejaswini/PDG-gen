import java.util.Scanner;

//The Number of the Real Roots of a Cubic Equation
public class Main{

	int a, b, c, d;
	double EPS = 1e-9;

	double f(double x){
		return a*x*x*x + b*x*x + c*x + d;
	}
	double df(double x){
		return 3*a*x*x + 2*b*x + c;
	}
	double bs(double L, double R, boolean up){
		while(Math.abs(R-L)>EPS){
			double m = (L+R)/2;
			if(up){
				if(f(m)>0)R = m;
				else L = m;
			}
			else{
				if(f(m)>0)L = m;
				else R = m;
			}
		}
		return L;
	}


	void run(){
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T--!=0){
			a = sc.nextInt(); b = sc.nextInt(); c = sc.nextInt(); d = sc.nextInt();
			int D = 4*b*b-12*a*c, rm = 0, rp = 0;
			//			System.out.println("D:"+D);
			if(D<0){
				//				System.out.println("D<0");
				if(EPS<Math.abs(f(0))){
					if(f(-1000)*f(1000)<0){
						double x0 = bs(-1000, 1000, 0<c);
						if(EPS<x0)rp++;
						else if(x0<-EPS)rm++;
					}
				}
			}
			else if(D==0){
				//				System.out.println("D==0");
				//f0: ÉlðÆéx fm, fp: ÉltßÌ
				double f0 = -b/3/a, fm = df(f0-1), fp = df(f0+1);
				//f0Ådð
				if(Math.abs(f(f0))<EPS){
					if(f0>EPS)rp = 3;
					else if(f0<-EPS)rm = 3;
				}
				else{
					//-INF - f0
					if(f(-1000)*f(f0)<0){
						double x0 = bs(-1000, f0, 0<fm);
						if(EPS<x0)rp++;
						else if(x0<-EPS)rm++;
					}
					//f0 - +INF
					if(f(f0)*f(1000)<0){
						double x0 = bs(f0, 1000, 0<fp);
						if(EPS<x0)rp++;
						else if(x0<-EPS)rm++;
					}
				}
			}
			else{
				//				System.out.println("D>0");
				//ÉlðÆéx
				double f1 = (-2*b-Math.sqrt(D))/6/a, f2 = (-2*b+Math.sqrt(D))/6/a;
				//				System.out.println("F1:"+f1 + " F2:"+f2);
				double fm = df(f1-1), fmid = df((f1+f2)/2), fp = df(f2+1);
				//f1Ådð
				if(Math.abs(f(f1))<EPS){
					if(EPS<f1)rp+=2;
					else if(f1<-EPS)rm+=2;
				}
				//f2Ådð
				if(Math.abs(f(f2))<EPS){
					if(EPS<f2)rp+=2;
					else if(f2<-EPS)rm+=2;
				}
				//-INF - f1
				if(f(-1000)*f(f1-EPS)<0){
					double x0 = bs(-1000, f1-EPS, 0<fm);
					if(EPS<x0)rp++;
					else if(x0<-EPS)rm++;
				}
				else{
					//f1 - f2
					if(f(f1+EPS)*f(f2-EPS)<0){
						double x0 = bs(f1+EPS, f2-EPS, 0<fmid);
						if(EPS<x0)rp++;
						else if(x0<-EPS)rm++;
					}
					//f2 - +INF
					if(f(f2+EPS)*f(1000)<0){
						double x0 = bs(f2+EPS, 1000, 0<fp);
						if(EPS<x0)rp++;
						else if(x0<-EPS)rm++;
					}
				}
			}
			System.out.println(rp+" "+rm);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}