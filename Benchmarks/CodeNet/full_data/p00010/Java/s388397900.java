import java.util.*;
import java.io.*;
class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	double x1,y1,x2,y2,x3,y3,D,z1,z2;
	int t = Integer.valueOf(sc.nextInt());
	for(int i=0; i<t; i++){
	    x1 = sc.nextDouble();
	    y1 = sc.nextDouble();
	    x2 = sc.nextDouble()-x1;
	    y2 = sc.nextDouble()-y1;
	    x3 = sc.nextDouble()-x1;
	    y3 = sc.nextDouble()-y1;
	    D=2*(x2*y3-y2*x3);
	    z1 = (y3*(x2*x2+y2*y2)-y2*(x3*x3+y3*y3))/D;
	    z2 = (x2*(x3*x3+y3*y3)-x3*(x2*x2+y2*y2))/D;
	    System.out.printf("%1.3f %1.3f %1.3f\n", z1, z2,Math.sqrt((z1-x2)*(z1-x2)+(z2-x2)*(z2-x2)));
	}
    }
}