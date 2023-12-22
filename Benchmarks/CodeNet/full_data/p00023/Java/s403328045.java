import java.util.*;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	int n = sc.nextInt();
	while(n!=0){
	    double[] x = new double[2];
	    double[] y = new double[2];
	    double[] r = new double[2];
	    for(int i=0; i<2; i++){
		x[i] = sc.nextDouble();
		y[i] = sc.nextDouble();
		r[i] = sc.nextDouble();
	    }

	    double dist = getDistance(x,y,r);

	    int ans = 0;
	    if(dist<0){
		if(r[0]>r[1]){ans = 2;}
		else {ans = -2;}
	    }
	    else if(dist>0){ans = 0;}
	    else if(dist==0){ans = 1;}

	    System.out.println(ans);
	    n--;
	}
    }

    public static double getDistance(double[] x, double[] y, double[] r){
	return Math.sqrt((x[0]-x[1])*(x[0]-x[1])+(y[0]-y[1])*(y[0]-y[1]))-r[0]-r[1];
    }
}