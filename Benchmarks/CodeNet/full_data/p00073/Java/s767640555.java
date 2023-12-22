import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
class Main{
    public static void main(String[] a){
    	int x = 0;
    	
    	int h = 0;
    	double shikaku = 0;
    	double sankaku = 0;
    	Scanner scan = new Scanner(System.in);
    	while (true){ 
    	x = scan.nextInt();
    	h = scan.nextInt();
    	if (x == 0 && h == 0){
    		break;
    	}
    	shikaku = x*x;
        double takasa =  Math.sqrt(h*h+(x/2)*(x/2));
    	sankaku =  (x*takasa/2*4);
    	double S = x*Math.sqrt(4*h*h+x*x) + x*x;
    	System.out.println(S);
    	}
    }
}