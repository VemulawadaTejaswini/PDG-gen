
import java.io.*;
import java.util.*;


public class Main{ 

	public static void main(String args[]){
		
		Scanner scan = new Scanner(System.in);
		Range rng = new Range(scan.nextInt(),scan.nextInt(),scan.nextInt());
		if(rng.judge())
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}

class Range{
	int a,b,c;
	public Range(int x,int y,int z){
		a=x;
		b=y;
		c=z;
	}
	public boolean judge(){
		return a<b && b<c;
	}
	
}