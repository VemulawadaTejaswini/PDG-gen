import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args)
			throws java.io.IOException{
		Scanner scan = new Scanner(System.in);
		int[] delta=new int[5];
		
			for(int j=0;j<5;j++){
				delta[j] = scan.nextInt();	
			}
			Arrays.sort(delta);
			System.out.print(delta[4]+" ");
System.out.print(delta[3+" "]);
System.out.print(delta[2+ " "]);
System.out.print(delta[1]+" ");
System.out.print(delta[0]);
			
	}
}