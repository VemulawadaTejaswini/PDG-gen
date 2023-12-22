import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = scan.nextInt();
			int d = scan.nextInt();
			int e = scan.nextInt();
			int f = scan.nextInt();
			
			b = b / a;
			c = c / a;
				
			e = e - b * d;
			f = f - c * d;
			d = 0;
						
			f = f / e;
			e = 1;
			
			c = c - f*b;			
			b = 0;
			System.out.println(c+" "+f);
		}
		
		
	}
}