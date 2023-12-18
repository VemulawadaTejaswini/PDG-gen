package SS;

import java.util.Scanner;

public class SSS {

	public static void main(String[] args) {
		int a,b,i,j,k,x,y;
		Scanner m= new Scanner(System.in);
			a=m.nextInt();
			x=a/100;
			y=a%100;
			if(x>=1 && x<=12 && y>=1 && y<=12)
			System.out.println("AMBIGUOUS");
			else if(x>=1 && x<=12)
		    System.out.println("MMYY");
			else if(y>=1 &&y<=12)
			System.out.println("YYMM");
			else
				System.out.println("NA");
	   
	}

}
