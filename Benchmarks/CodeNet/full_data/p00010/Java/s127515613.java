import java.util.Scanner;

class Main {

    static double[] getLine(double x1, double y1, double x2, double y2){
	double[] ans = new double[3];
	double mid_x = (x1 + x2) / 2;
	double mid_y = (y1 + y2) / 2;
	ans[0] = y1 - y2;
	ans[1] = x1 - x2;
	ans[2] = - mid_y * (y1 - y2) - mid_x * (x1 - x2);
	return ans;
    }
    
    public static void main(String[] args){
	Scanner stdin = new Scanner(System.in);
	int n = stdin.nextInt();
	double[] co = new double[6];
	for(int i = 0; i < n; i++){
	    for(int j = 0; j < co.length; j++){
		co[j] = stdin.nextDouble();
	    }
	    double[] l1 = getLine(co[0], co[1], co[2], co[3]);
	    double[] l2 = getLine(co[0], co[1], co[4], co[5]);
	    
	    double x = (l1[0] * l2[2] - l1[2] * l2[0]) / (l1[1] * l2[0] - l1[0] * l2[1]);
	    double y;
	    if(l1[0] != 0){
		y = (l1[1] * x + l1[2]) / -l1[0];
	    } else {
		y = (l2[1] * x + l2[2]) / -l2[0];
	    }	    
	    double r = Math.sqrt(Math.pow(x - co[0], 2) + Math.pow(y - co[1] , 2));
	    System.out.printf("%.3f %.3f %.3f\n", x, y, r);
	}
    }
    
}