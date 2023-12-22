import java.util.*;
import java.math.*;
public class Main {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		
		for( int A = (-120); A < (120); A++){
			for( int B = (-120); B < (120); B++){
			if(Math.pow(A,5)-Math.pow(B,5) == X)
			{System.out.println(A+" "+B); return;}
		}
		}
	}
}