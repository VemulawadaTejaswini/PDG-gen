import java.util.*;
import java.lang.*;
import java.io.*;
public class Main {
	public static void main(String[] args){
      	
		Scanner sc = new Scanner(System.in);
		//String word_before = sc.next();
		//int K = sc.nextInt();
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		
		if (Math.sqrt(A)+Math.sqrt(B)<Math.sqrt(C)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

      	sc.close();
    }
		
		
}