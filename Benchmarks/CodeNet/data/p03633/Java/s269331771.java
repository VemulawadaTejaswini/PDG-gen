import java.util.*;

public class Main{
	public static void main(String[] args){
	    Scanner scanner = new Scanner(System.in);
		double n=scanner.nextDouble();
		double[] array = new double[(int)n];
	    double ans=0;
	    for(double i=0;i<n;i++){   
		array[(int)i]=scanner.nextDouble();
	    }
	    for(double i=0;i<n-1.0;i++){
		array[(int)i+1]=(lcm(array[(int)i],array[(int)i+1]));
	    }
	    ans = array[(int)n-1];
	    System.out.println((long)ans);
	}
private static double lcm(double m, double n) {
    return m * n / gcd(m, n);
}
private static double gcd(double m, double n) {
    if(m < n) return gcd(n, m);
    if(n == 0) return m;
    return gcd(n, m % n);
}
}