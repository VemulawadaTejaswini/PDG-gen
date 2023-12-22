import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
   
class Main {
    public static void main(String[] a) throws IOException {
    	int[][] results = null;
    	double x1;
    	double y1;
    	double x2;
    	double y2;
    	double x3;
    	double y3;
    	double p;
    	double q;
    	double hankei;
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for(int i = 0; i < num;i++){
        	x1 = scan.nextDouble();
        	y1 = scan.nextDouble();
        	x2 = scan.nextDouble();
        	y2 = scan.nextDouble();
        	x3 = scan.nextDouble();
        	y3 = scan.nextDouble();
        	p =((2*(y2-y1))*(x1*x1-x3*x3+y1*y1-y3*y3)-(2*(y3-y1))*(x1*x1-x2*x2+y1*y1-y2*y2))/((2*(x2-x1))*(2*(y3-y1))-(2*(x3-x1))*(2*(y2-y1)));
        	q =((x1*x1-x2*x2+y1*y1-y2*y2)*(2*(x3-x1))-(x1*x1-x3*x3+y1*y1-y3*y3)*(2*(x2-x1)))/((2*(x2-x1))*(2*(y3-y1))-(2*(x3-x1))*(2*(y2-y1)));
        	hankei = Math.sqrt((x1-p)*(x1-p)+(y1-q)*(y1-q));
        	System.out.printf("%.3f %.3f %.3f\n", p ,q , hankei);
        }
        
       
    }
}