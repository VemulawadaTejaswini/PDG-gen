
import java.util.*;
public class Main {
	
	static int i,x,n;
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		i=1;
		checkNum();
		System.out.println();
	}
	
	static void checkNum() {
		x=i;
		if(x%3==0) {
			System.out.print(" "+i);
			endCheckNum();
		}
		else include3();
	}
	
	static void include3() {
		if(x%10==3) {
			System.out.print(" "+i);
			endCheckNum();
		}
		else {
			x/=10;
			if(x>0)include3();
			else endCheckNum();
		}
	}
	
	static void endCheckNum() {
		if(++i<=n)checkNum();
	}
	

}

