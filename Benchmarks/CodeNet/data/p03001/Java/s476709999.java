import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		double xo = h*x;
		double xt = h*(w-x);
		double xx = Math.min(xo,xt);
		double yo = w*y;
		double yt = w*(h-y);
		double yy = Math.min(yo,yt);
		int ans2;
		if(xx == yy){
			ans2 = 1;
		}else{
			ans2 = 0;
		}
		System.out.print(Math.max(xx,yy) + " " + ans2);
	}
}
