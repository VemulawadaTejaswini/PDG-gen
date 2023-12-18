import java.util.Scanner;
import java.lang.Math;

public class Main{
	public static void main(String args[]){
		try{

			Scanner sc = new Scanner(System.in);
			long x = sc.nextLong();
			long y = sc.nextLong();

			long p = 0;
			while(x * Math.pow(2,p) < y){
				p++;
			}
			System.out.println(p);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}