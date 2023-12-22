import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		scan.useDelimiter("[^0-9.]+");
		
		int n = scan.nextInt();

		for(int i=0;i<n;i++){
			double xa = scan.nextDouble();
			double ya = scan.nextDouble();
			double ra = scan.nextDouble();
			double xb = scan.nextDouble();
			double yb = scan.nextDouble();
			double rb = scan.nextDouble();
			
			double d = Math.sqrt((xa-xb)*(xa-xb)+(ya-yb)*(ya-yb));
			
			if(ra+rb<d){
				System.out.println(0);
			}else if(ra>d+rb){
				System.out.println(2);
			}else if(rb>d+ra){
				System.out.println(-2);
			}else
			{
				System.out.println(1);
			}
		}
		
		scan.close();
	}
}