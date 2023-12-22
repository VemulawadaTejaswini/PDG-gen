import java.util.*;
import java.lang.*;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int D = sc.nextInt();
		long[]X = new long[N];
		long[]Y = new long[N];
		int count =0;

		for(int i=0; i<N; i++){
		X[i] =sc.nextLong();
		Y[i] =sc.nextLong();
		
			if(X[i]*X[i]+Y[i]*Y[i] <=D*D){
			count++;
			}
		}

		System.out.println(count);				

	}//main

}//Distance
