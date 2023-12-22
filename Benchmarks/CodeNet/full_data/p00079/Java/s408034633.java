import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
	try {
	    String st;
	    ArrayList<Double> x, y;
	    x = new ArrayList<Double>();
	    y = new ArrayList<Double>();
	    while((st=sc.readLine())!=null){
		String[] sp = st.split(",");
		x.add(Double.valueOf(sp[0]));
		y.add(Double.valueOf(sp[1]));
	    }
	    double sum1 = x.get(x.size()-1)*y.get(0), sum2 = x.get(0)*y.get(y.size()-1);;
	    for(int i=0; i<x.size()-1; i++){
		sum1+=x.get(i)*y.get(i+1);
		sum2+=x.get(i+1)*y.get(i);
	    }
	    System.out.println(Math.abs(sum1-sum2)/2.0);
	}catch(Exception e){
	    System.out.println("Error");
	}
    }
}