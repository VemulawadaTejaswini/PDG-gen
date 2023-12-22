import java.util.Scanner;
import java.awt.geom.Point2D;

class Calc{
    double calc(int n,boolean x){
	double theta = 0;
	int c = 1;
	if(x){
	    //System.out.println("min");
	    c *= 5;
	}
	if(n>=0*c&&n<3*c){
	    //System.out.println("case1");
	    theta = (0.5-(double)n/(double)(6*c))*Math.PI;
	}else if(n>=3*c&&n<6*c){
	    //System.out.println("case2");
	    theta = (2-(double)(n-3*c)/(double)(6*c))*Math.PI;
	}else{
	    //System.out.println("case3");
	    //System.out.println((1+(double)(9*c-n)/(double)(6*c)));
	    theta = (1+(double)(9*c-n)/(double)(6*c))*Math.PI;
	}
	System.out.println(theta);
	return theta;
    }
}

class Main{
    public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int h = sc.nextInt();
	int m = sc.nextInt();
	double thetaA=0,thetaB=0;
	Calc calc = new Calc();
	thetaA = calc.calc(h,false);
	thetaB = calc.calc(m,true);
	//System.out.println("thetaA"+thetaA);
	//System.out.println("thetaB"+thetaB);
	double ax = a*Math.cos(thetaA);
	double ay = a*Math.sin(thetaA);
	double bx = b*Math.cos(thetaB);
	double by = b*Math.sin(thetaB);
	System.out.println(Point2D.distance(ax,ay,bx,by));
    }
}

