import java.util.*;
import java.lang.*;
import java.math.BigDecimal;
import java.io.*;
public class Main {
	public static void main(String[] args){
      	
		Scanner sc = new Scanner(System.in);
		//String word_before = sc.next();
		//int K = sc.nextInt();
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		BigDecimal a = new BigDecimal(Math.sqrt(A));
		BigDecimal b = new BigDecimal(Math.sqrt(B));
		BigDecimal c = new BigDecimal(Math.sqrt(C));

		
		if (a.add(b).compareTo(c)==-1) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

      	sc.close();
    }
		
		
}