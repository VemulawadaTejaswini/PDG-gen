import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x = 0, y = 0;
		int angle = 90;
		while(sc.hasNext()){
			String[] xy = sc.next().split(",");
			int des = Integer.valueOf(xy[0]);
			int a = Integer.valueOf(xy[1]);
			if(des==0 && a==0)break;
			x += des * Math.cos(Math.toRadians(angle));
			y += des * Math.sin(Math.toRadians(angle));
			angle -= Integer.valueOf(xy[1]);
		}
		System.out.println((int)x);
		System.out.println((int)y);
	}
}