
import java.util.*;

class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int H = sc.nextInt();
		int M = sc.nextInt();
		double x1 = B * Math.cos(Math.PI/2 - (M*Math.PI)/30);
		double y1 = B * Math.sin(Math.PI/2 -(M*Math.PI)/30);
		double x2 = A * Math.cos(Math.PI/2 -(H*Math.PI)/6);
		double y2 = A * Math.sin(Math.PI/2 -(H*Math.PI)/6);
		double dx = Math.abs(x1 - x2);
		double dy = Math.abs(y1 - y2);
		double ansans = Math.pow(dx,2) + Math.pow(dy, 2);
		double ans = Math.sqrt(ansans);
		
		System.out.println(ans);
		
	}



}


