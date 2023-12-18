import java.util.Scanner;


public class Main {
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		long x=s.nextLong();
		long y=s.nextLong();
		
		Long z=(long)Math.pow(10, 18);
		
		while(x<z){
			long t= x/y;
			if(t*y==x){
				x+=x;
			}
			else{
				System.out.println(x);
				System.exit(0);
			}
		}
		System.out.println(-1);
		
	}
}