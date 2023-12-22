import java.util.ArrayList;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ArrayList<String> x = new ArrayList<String>();

		while(sc.hasNextInt()){
			int a=sc.nextInt();
			int b=sc.nextInt();
			int d=0;
			int r=0;
			double f=0;
			
			d=a/b;
			r=a%b;
			f=(double)a/(double)b;
			
				System.out.print(d+" "+r+" ");
				System.out.printf("%.5f",f);
			}
			
		}
	}
