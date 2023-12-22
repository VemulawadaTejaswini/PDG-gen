import java.util.Scanner;

public class Main{
	
	static Main byakko = new Main();
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args){
		
		int n = sc.nextInt();
		double x,y,x1,y1,x2,y2,x3,y3,dx,dy;
		
		for(int i = 0; i < n; i++){
			x  = sc.nextDouble();
			y  = sc.nextDouble();
			x1 = sc.nextDouble();
			y1 = sc.nextDouble();
			x2 = sc.nextDouble();
			y2 = sc.nextDouble();
			x3 = sc.nextDouble();
			y3 = sc.nextDouble();
			
			dx = (y1 - y) / (x1 - x);
			dy = (y3 - y2) / (x3 - x2);
			
			if(dx == dy)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}