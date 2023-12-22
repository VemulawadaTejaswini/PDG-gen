
import java.io.*;
import java.util.*;


public class Main{ 

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
	    int a= scan.nextInt();
	    int b=scan.nextInt();
	    numbers num = new numbers(a,b);
	    num.comp();
		
	}
}

class numbers{
	int a;
	int b;
	public numbers(int x, int y){
		a=x;
		b=y;
	}
	public void comp(){
		if(a>b)
		System.out.println("a > b");
		else if(a<b)
		System.out.println("a < b");
		else
		System.out.println("a == b");
	}
	
}