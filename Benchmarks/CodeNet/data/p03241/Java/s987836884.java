package l1;

import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		long N=sc.nextLong();
		long M=sc.nextLong();
		long max=1;
		for(int i=1; i*i<=M; i++){
			if(M%i==0 && i*N<=M){
				max=Math.max(max,i);
			}
			if(M%(M/i)==0 && (M/i)*N<=M){
				max=Math.max(max,(M/i));
			}
		}
		System.out.println(max);
	}
}