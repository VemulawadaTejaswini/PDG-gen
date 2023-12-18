import java.util.*;

import com.oracle.webservices.internal.api.EnvelopeStyle;

import java.lang.*;
import java.io.*;

class Main{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int D = sc.nextInt();
		int N = sc.nextInt();

		if(D == 0)
			System.out.println(N);
		else if(D == 1)
			System.out.println(100*N);
		else 
			System.out.println(1000*N);

	}
}