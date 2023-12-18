import java.lang.*;
import java.io.*;
import java.util.*;

class Main{
	public static void main(String args[]) throws FileNotFoundException{
		
		FScanner fs=new FScanner();
		
		int n=fs.readInt();
		
		if(n<=1199){
			System.out.println("ABC");
		}else if(n<=2799){
			System.out.println("ARC");
		}else{
			System.out.println("AGC");
		}
		
	}

	static void disp(int[] data){
		for(int i=0; i<data.length; i++){
				System.out.printf("%d ",data[i]);
		}
			System.out.println();
	}
	
	static class FScanner{
		Scanner sc;
		FScanner() throws FileNotFoundException{
			sc=new Scanner(System.in);
		}
		int readInt(){
			int i=Integer.parseInt(sc.nextLine());
			return i;
		}
		
	}
}
