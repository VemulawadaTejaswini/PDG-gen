import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		int h=sc.nextInt();
		int m=sc.nextInt();
		
		double t=h*60+m;
		
		
		//double hx = Math.sin(Math.toRadians(t*0.5))*3;
		//double hy = Math.cos(Math.toRadians(t*0.5))*3;
		double hx = Math.cos(Math.toRadians(t*0.5-90))*3;
		double hy = Math.sin(Math.toRadians(t*0.5-90))*3;
		System.out.println(hx);
		System.out.println(hy);
		
		//double mx = Math.sin(Math.toRadians(t/6))*4;
		//double my = Math.cos(Math.toRadians(t/6))*4;
		double mx = Math.cos(Math.toRadians(t*6-90))*4;
		double my = Math.sin(Math.toRadians(t*6-90))*4;
		System.out.println(mx);
		System.out.println(my);
		
		double d = Math.sqrt((hy-my)*(hy-my)+(hx-mx)*(hx-mx));
		System.out.println(d);
		
	}

}
