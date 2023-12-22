import java.util.Scanner;
import java.io.*;

public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		while(!str.equals("")){
			boolean check=false; 
			String[] data=str.split(" ", 8);
			Point a=new Point(data[0],data[1]);
			Point b=new Point(data[2],data[3]);
			Point c=new Point(data[4],data[5]);
			Point p=new Point(data[6],data[7]);
			if((p.x-a.x)*(p.x-b.x)<0&&(p.x-a.x)*(p.x-c.x)<0){
				double i=func(a,b,p.x);
				double j=func(a,c,p.x);
				if((p.y-i)*(p.y-j)<0){
					check=true;
				}
			}else if((p.x-a.x)*(p.x-b.x)<0&&(p.x-b.x)*(p.x-c.x)<0){
				double i=func(a,b,p.x);
				double j=func(b,c,p.x);
				if((p.y-i)*(p.y-j)<0){
					check=true;
				}
			}else if((p.x-b.x)*(p.x-c.x)<0&&(p.x-a.x)*(p.x-c.x)<0){
				double i=func(b,c,p.x);
				double j=func(a,c,p.x);
				if((p.y-i)*(p.y-j)<0){
					check=true;
				}
			}
			if(check){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
			str=sc.nextLine(); 
			if(str.equals("")){
				break;
			}
		}
	}
	static double func(Point p1,Point p2,double c){
		double f;
		double a=(p1.y-p2.y)/(p1.x-p2.x);
		f=a*(c-p1.x)+p1.y;
		return f;
	}
}

class Point{
	double x,y;
	Point(String c,String d){
		double a=Double.parseDouble(c);
		double b=Double.parseDouble(d);
		x=a;
		y=b;
	}
}