import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	void doIt() {
		double x = 0,y = 0;
		int angle = 90;
		while(true){
			String[] num = sc.next().split(",");
			int des = Integer.valueOf(num[0]);
			int a = Integer.valueOf(num[1]);
			if(des == 0 && a == 0)break;
			x = x + des * Math.cos(Math.toRadians(angle));
			y = y + des * Math.sin(Math.toRadians(angle));
			angle = angle - Integer.valueOf(num[1]);
		}
		System.out.println((int)x);
		System.out.println((int)y);
     }
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
    	new Main().doIt();
    }
}