import java.util.Scanner;

 public class Main{
	 public static void main(String[] args){
		 Scanner s = new Scanner(System.in);
		 while(s.hasNextDouble()){
			 double a= s.nextDouble();
			 double b= s.nextDouble();
			 double c= s.nextDouble();
			 double d= s.nextDouble();
			 double e= s.nextDouble();
			 double f= s.nextDouble();
			 double x=(c*e-b*f)/(a*e-b*d);
			 double y=(c*d-a*f)/(b*d-a*e);
			 System.out.printf("%.3f %.3f\n",x,y);
		 }
		 }
	 } 