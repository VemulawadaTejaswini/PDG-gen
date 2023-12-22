import java.io.PrintWriter;
import java.util.*;

import static java.lang.Math.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in); 
		PrintWriter out=new PrintWriter(System.out);
		double money = 100000;
		final double tax = 1.05;
		int n= sc.nextInt();
		for(int i=0;i<n;i++){
			money*=tax;
			money/=1000;
			money=ceil(money);
			money*=1000;
		}
		out.println((int)money);
		out.flush();
	}

}


	