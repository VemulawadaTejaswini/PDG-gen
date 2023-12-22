import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	String ns = br.readLine();
	int n = Integer.parseInt(ns);
	double[] x = new double[4];
	double[] y = new double[4];
	String sti="";
	while((sti=br.readLine())!=null){
	    if(sti.contains(" ")){
	    StringTokenizer st = new StringTokenizer(sti);
	    
	    for(int i = 0;i < 4; i++){
		x[i]= Double.parseDouble(st.nextToken());
		y[i]=Double.parseDouble(st.nextToken());
	    }
	    double a1 = (y[1]-y[0])/(x[1]-x[0]);
	    double a2 = (y[3]-y[2])/(x[3]-x[2]);
	    if(a1==a2)
		System.out.println("YES");
	    else
		System.out.println("NO");
	    }
	}
    }
}