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
		
		int n=inp.nextInt();
		int x=inp.nextInt();
		int t=inp.nextInt();
		System.out.println((((n+x-1))/x)*t);
		
	}
    
    
		
}
