

import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int ans=0;
	    if(n%1000!=0)ans=1000-n%1000;
	    
	   System.out.println(ans);
	   
	}
}

