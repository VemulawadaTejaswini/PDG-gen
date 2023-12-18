package yenProblem;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

int q,h,s,d,n;
Scanner scan=new Scanner(System.in);
q=scan.nextInt();
h=scan.nextInt();
s=scan.nextInt();
d=scan.nextInt();
n=scan.nextInt();
System.out.println(solve(n,q,h,s,d));
		
	}
	
	public static int solve (double n,int q,int h,int s,int d) {
	if(n>=2) {
		return Math.max(Math.min(d+solve(n-2,q,h,s,d),s+solve(n-1,q,h,s,d)), Math.min(q+solve(n-0.25,q,h,s,d),h+solve(n-0.5,q,h,s,d)));
	}
	else if(n>=1) {
		return Math.min(s+solve(n-1,q,h,s,d), Math.min(q+solve(n-0.25,q,h,s,d),h+solve(n-0.5,q,h,s,d)));
	}
	else if(n==0.75)return Math.min(q+solve(n-0.25,q,h,s,d),h+solve(n-0.5,q,h,s,d));
	else if(n==0.5) return Math.min(q+solve(n-0.25,q,h,s,d),h+solve(n-0.5,q,h,s,d));
	else if(n==0.25)return q;
	else return 0;
	}

}
