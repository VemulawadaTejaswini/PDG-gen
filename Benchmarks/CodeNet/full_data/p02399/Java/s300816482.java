import static java.lang.String.*;

import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = null;
		try{
			scan =new Scanner(System.in);
			int a ,b;
			a = scan.nextInt();b = scan.nextInt();
			int d = a/b;
			int r = a %b;
			double f = (double)a / (double)b;
			System.out.printf("%d %d %f\n",d,r,f);
			}finally{
			if(scan !=null)scan.close();
		}

	}
}