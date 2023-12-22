import java.util.*;
import java.io.*;
public class Main {

	static Scanner inp= new Scanner(System.in);
	static PrintWriter out= new PrintWriter(System.out);
	public static void main(String args[]) {		    	
	   	Main g=new Main();
	   	g.main();
	   	out.close();
	}

	
	
	//Main
	void main() {
		
		double d=inp.nextDouble();
		double t=inp.nextDouble();
		double s=inp.nextDouble();
		System.out.println(d/s<=t?"Yes":"No");
		
	}
    
    
		
}
