import java.util.*;
import java.io.*;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str;
        String strary[] = new String[8];
        double x[] = new double[3];
        double y[] = new double[3];
        double xp,yp;
        double A,B,C;
        str = sc.nextLine();
        while(!str.equals("")){
        	strary = str.split(" ");
        	int j = 0;
        	for (int i = 0; i < 6; i+=2) {
        		x[j] = Double.parseDouble(strary[i]);
        		y[j] = Double.parseDouble(strary[i+1]);
        		j++;
        	}
        	xp = Double.parseDouble(strary[6]);
        	yp = Double.parseDouble(strary[7]);
        	A=(x[1]-x[0])*(yp-y[0])-(y[1]-y[0])*(xp-x[0]);
        	B=(x[2]-x[1])*(yp-y[1])-(y[2]-y[1])*(xp-x[1]);
        	C=(x[0]-x[2])*(yp-y[2])-(y[0]-y[2])*(xp-x[2]);
        	if((A<0 && B<0 && C<0) || (A>0 && B>0 && C>0))
        		System.out.println("YES");
        	else
        		System.out.println("NO");
        	str=sc.nextLine();
        	if(str.equals(""))	break;
        }
    }
}