import java.util.Scanner;

public class Main{
	public int n = 0;
	public int[] x;
	public int[] y;
	public double area = 0.0;
	
	public static int count = 0;
	public static Scanner scan;
	Main(){}
	
	Main(int _n){
		n = _n;
		x = new int[n];
		y = new int[n];
	}
	
	public boolean process(){
		if( n <= 0 ){ return false; }
		for( int i = 0; i < n; i++ ){
			x[i] = scan.nextInt();
			y[i] = scan.nextInt();
		}
		for( int i = 1; i < n-1; i++ ){
			area += ((x[i+1]-x[0])*(y[i]-y[0]) - (x[i]-x[0])*(y[i+1]-y[0])) / 2.0;
		}
		System.out.println(count + " " + area);
		return true;
	}
	
	public static void main(String[] args){
		scan = new Scanner(System.in);
		for( count = 1; new Main(scan.nextInt()).process(); count++ );
		return;
	}
}