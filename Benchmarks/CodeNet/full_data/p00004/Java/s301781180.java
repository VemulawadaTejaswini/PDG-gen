import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double a[];
		
		while(scan.hasNext()){
			a = new double[6];
			
			for(int i=0;i<6;i++){
				a[i]=scan.nextDouble();
			}
			
			double d = a[0]*a[4]-a[1]*a[3];
			double x = (a[4]*a[2]-a[1]*a[5])/d;
			double y = (a[0]*a[5]-a[2]*a[3])/d;
			if(x==0)x=0;
			if(y==0)y=0;
			
			System.out.printf("%.3f %.3f\n", x, y);
		}
	}
}