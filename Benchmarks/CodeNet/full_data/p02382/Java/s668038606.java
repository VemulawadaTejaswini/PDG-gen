import java.util.Scanner;
public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	int n = Integer.parseInt(scan.nextLine());
	String[] xs = scan.nextLine().split(" ");
	String[] ys = scan.nextLine().split(" ");
	int[] x = new int[n];
	int[] y = new int[n];
	for (int i = 0; i < n; i++) {
	    x[i] = Integer.parseInt(xs[i]);
	    y[i] = Integer.parseInt(ys[i]);
	}
	System.out.println(manhattanDistance(x, y));
	System.out.println(minkowskiDistance(x, y, 2));
	System.out.println(minkowskiDistance(x, y, 3));
	System.out.println(chebyshevDistance(x, y));
    }
    public static double absoluteValue(int a, int b){
	if (a < b) {
	    return (double)b - a;
	} else {
	    return (double)a - b;
	}
    }
    public static double manhattanDistance(int[] x, int[] y){
	double sum = 0;
	for (int i = 0; i < x.length; i++) {
	    sum += absoluteValue(x[i], y[i]);
	}
	return (double)sum;
    }
    public static double minkowskiDistance(int[] x, int[] y, int p){
	double sum = 0;
	for (int i = 0; i < x.length; i++) {
	    sum += Math.pow(absoluteValue(x[i], y[i]), p);
	}
	if (p == 2) {
	    return Math.sqrt(sum);
	} else if (p == 3) {
	    return Math.cbrt(sum);
	}
	return 0;
    }
    public static double chebyshevDistance(int[] x, int[] y){
	int max = 0;
	for (int i = 0; i < x.length; i++) {
	    int distance = absoluteValue(x[i], y[i]);
	    if (max < distance) {
		max = distance;
	    }
	}
	return (double)max;
    }
}