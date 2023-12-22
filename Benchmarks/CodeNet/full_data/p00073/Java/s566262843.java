import java.util.Scanner;

class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double x, h, s, v;
		
		while(true){
			x = scan.nextDouble();
			h = scan.nextDouble();
			if(x == 0 && h == 0)break;
			
			s = Math.sqrt(Math.pow(h, 2) + Math.pow(x/2, 2));
			
			v = x * x + x * s * 2;
			System.out.println(v);
		}
	}
}