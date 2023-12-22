import java.util.*;
import java.io.*;

class Main{
	public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String rank ="";
        while(sc.hasNext()){
        	double f =sc.nextDouble();
        	double s =sc.nextDouble();
        	
        	if(f<35.5 && s<71.0) rank ="AAA";
        	else if(f<37.50 && s<77.00) rank ="AA";
        	else if(f<40.00 && s<83.00) rank ="A";
        	else if(f<43.00 && s<89.00) rank ="B";
        	else if(f<50.00 && s<105.00) rank ="C";
        	else if(f<55.00 && s<116.00) rank ="D";
        	else if(f<70.00 && s<148.00) rank ="E";
        	else rank="NA";
        	
        	System.out.println(rank);
        }
	}
	}