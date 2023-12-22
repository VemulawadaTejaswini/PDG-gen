 import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.*;

import static java.lang.Math.*;
//Area of Polygon
public class Main{
	static PrintWriter out = new PrintWriter(System.out);
	static double[][] ple = new double[20][2];
    static int count = 0;
    public static void main(String[] args) {       
        input();
        output();
        out.flush();
       
      
    }
    static void input(){
    	Scanner sc = new Scanner(System.in);
    	for(int i = 0;sc.hasNext();i++){
            String s[] = sc.next().split(",");
            ple[i][0]=Double.parseDouble(s[0]);
            ple[i][1]=Double.parseDouble(s[1]);
            
            count = i+1;
        }
    	
    }
    static void output(){
    	
    	 double a = 0;
         for(int i=0;i<count;i++){
             double x1 = ple[i][0];
             double y1 = ple[i][1];
             double x2 = ple[(i+1)%count][0];
             double y2 = ple[(i+1)%count][1];
             a += x1*y2;
             a -=x2*y1;
         }
         double temp = abs(abs(a/2));
         out.println(new DecimalFormat("#0.000000").format(temp));
    }
}