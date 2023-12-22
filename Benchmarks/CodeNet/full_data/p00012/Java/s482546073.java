import java.util.*;

class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	while(sc.hasNext()){
	    double[] x = new double[3];
	    double[] y = new double[3];
	    for(int i=0; i<3; i++){
		x[i] = sc.nextDouble();
		y[i] = sc.nextDouble();
	    }
	    double tri = getMenseki(3,x,y);

	    double xp = sc.nextDouble();
	    double yp = sc.nextDouble();
	    double[] xx = new double[4];
	    double[] yy = new double[4];
	    for(int i=0; i<3; i++){
		xx[i] = x[i];
		yy[i] = x[i];
	    }
	    xx[3] = xp;
	    yy[3] = yp;
	    double rec = getMenseki(4,xx,yy);

	    String ans = "NO";
	    if(tri>rec){ans = "YES";}
	    System.out.println(ans);
	}
    }

    public static double getMenseki(int n,double[] x, double[] y){
	double[] pro = new double[n];
	for(int i=0; i<n-1; i++){
	    pro[i] = (x[i]-x[i+1])*(y[i]+y[i+1]);
	}
	pro[n-1] = (x[n-1]-x[0])*(y[n-1]+y[0]);
	double ans = 0;
	for(int i=0; i<n; i++){
	    ans += pro[i];
	}
	if(ans<0){ans = (-1)*ans;}
	return (ans/2.0);	
    }
}