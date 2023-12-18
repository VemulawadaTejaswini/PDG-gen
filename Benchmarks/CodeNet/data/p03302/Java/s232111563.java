import java.lang.*;
import java.io.*;
import java.util.*;

class Main{
	public static void main(String args[]) throws FileNotFoundException{
		Scanner sc=new Scanner(System.in);
		
		String[] buf=sc.nextLine().split(" ");
		
		int a=Integer.parseInt(buf[0]);;
		int b=Integer.parseInt(buf[1]);;
		
		if(a+b!=15 && a*b!=15){
			System.out.println("x");
		}else if(a+b==15){
			System.out.println("+");
		}else if(a*b==15){
			System.out.println("*");
		}
	}

	static void disp(int[] data){
		for(int i=0; i<data.length; i++){
				System.out.printf("%d ",data[i]);
		}
			System.out.println();
	}
}
