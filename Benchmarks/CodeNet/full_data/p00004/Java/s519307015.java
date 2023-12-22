import java.io.*;
import java.util.*;
//連立方程式ax+b=c,dx+e=fの解を求める
class Simultaneous {
    public static void main(String[] args){
	String str;
	double[] coeff = new double[6];
	int i;
	try{
	    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	    str = input.readLine();//入力された文字列
	    StringTokenizer strCoeff = new StringTokenizer(str," ");//空白文字で分割
	    i = 0;
	    while(i<6)
		{
		    coeff[i] = Double.parseDouble(strCoeff.nextToken());
		    i++;
		}
	    double x,y,p,q;//y=p/q, p=af-cd, q=ae-bd, x=(cq-bp)/(aq)
	    p = coeff[0]*coeff[5]-coeff[2]*coeff[3];
	    q = coeff[0]*coeff[4]-coeff[1]*coeff[3];
	    if(coeff[0] != 0 && q != 0)
	    	{ 
	    x = (coeff[2]*q-coeff[1]*p)/(coeff[0]*q);
	    y = p/q;
	    String str_x = String.format("%.3f",x);
	    String str_y = String.format("%.3f",y);
	    System.out.println(str_x + " " + str_y);
	    	}

	}
	catch(Exception e)
	    {
		System.out.println("Error");
	    }
    }
}