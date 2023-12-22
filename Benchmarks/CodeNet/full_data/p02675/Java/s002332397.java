import java.util.*;
class Main {
public static void main(String[]args) {
	Scanner sc= new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int h=sc.nextInt();
	int m=sc.nextInt();
	double hr=h*30;
	double min=m*6;
	hr+=min/12;
	double diff=(double)Math.abs(hr-min)*(Math.PI/180);
	double res= Math.sqrt((a*a + b*b - 2*a*b*Math.cos(diff)));
	System.out.format("%.20f",res);
	}
}

