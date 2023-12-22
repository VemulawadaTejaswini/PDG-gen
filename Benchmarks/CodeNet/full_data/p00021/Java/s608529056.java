import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for(int i = 0; i < n; i++){
			double x1 = sc.nextDouble();
			double y1 = sc.nextDouble();
			double x2 = sc.nextDouble();
			double y2 = sc.nextDouble();
			double x3 = sc.nextDouble();
			double y3 = sc.nextDouble();
			double x4 = sc.nextDouble();
			double y4 = sc.nextDouble();
			double dx1 = Math.sin((y2 - y1) / (x2 - x1));
			double dy1 = Math.cos((y2 - y1) / (x2 - x1));
			double dx2 = Math.sin((y4 - y3) / (x4 - x3));
			double dy2 = Math.cos((y4 - y3) / (x4 - x3));
			if(dx1 / dy1 == dx2 / dy2)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		sc.close();
	}
}