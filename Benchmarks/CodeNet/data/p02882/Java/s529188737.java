import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt(); //底面の一辺の長さ
	    int b = sc.nextInt(); //高さ
	    double x = sc.nextDouble(); //水の体積
	    double max = Math.pow(a, 2) * b; //体積の最大値
	    //こぼれる瞬間が台形
	    double c = 0;
	    double d = 0;
	    double cos = 0;
	    if(x == max / 2) {
	        System.out.println((double)45);
	    }else if(x > max / 2) {
	        c = 2 * x / Math.pow(a, 2) - b;
	        d = Math.sqrt(Math.pow(a, 2)+Math.pow(b-c, 2));
	        cos = (Math.pow(a, 2) + Math.pow(d, 2) - Math.pow(b-c, 2)) / (2 * a * d);
	        System.out.println(_toDegrees(Math.acos(cos)));
	    //こぼれる瞬間が三角形    
	    }else {
	        c = a - ((2 * x) / (a * b));
	        d = Math.sqrt(Math.pow(a-c, 2)+Math.pow(b, 2));
	        cos = (Math.pow(a-c, 2) + Math.pow(d, 2) - Math.pow(b, 2)) / (2 * (a-c) * d);
	        System.out.println(_toDegrees(Math.acos(cos)));
	    }
	}
	
	private static double _toDegrees(double rad)
    {
        return rad * 180.0 / Math.PI;    
    }

}