

import java.util.Scanner;

 

public class Main{

public static void main(String[] args){

	int n,i,j;

	String s,top;

	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	top=sc.next();

	for(i=1;i<n;i++){

	        s=sc.next();

		for(j=0;j<s.length();j++){

			if(top.charAt(j)>s.charAt(j)){
				top=s.substring(0);
				break;
			}else if(top.charAt(j)<s.charAt(j)){
				break;
			}

		}

		if(j==s.length()&&s.length()<top.length()){
			top=s.substring(0);
		}

	}

	System.out.println(top);

 

}

}