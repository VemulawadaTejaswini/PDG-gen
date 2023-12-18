

import java.util.Arrays;
import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int L=sc.nextInt();

		int sum=0;
		int minaji=0;
		int temp=0;
		for(int i=1;i<=N;i++) {
			int aji=L+i-1;
			sum+=aji;
			if(i==1) {
				minaji=aji;
				temp=Math.abs(sum-(sum-aji));
				
			}
			else if(Math.abs(sum-(sum-aji))<temp) {
				temp=Math.abs(sum-(sum-aji));
				minaji=aji;
			}
			
	    }
		System.out.println(sum-minaji);
		
		
		
		
		
		
		
		
	
		
		
}
}