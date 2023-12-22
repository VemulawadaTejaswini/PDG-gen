

import java.util.Scanner;

 

public class Main{

public static void main(String[] args){

	int sum=0,i;

	String x;

	Scanner sc = new Scanner(System.in);

	while(true){

	        x=sc.next();

		if(x=="0"){

			break;

		}

		for(i=0;i<x.length();i++){

			sum+=x.charAt(i)-'0';

		}

	}

	System.out.printf("%d\n",sum);

 

}

}