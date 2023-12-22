import java.util.Scanner;

public class Main{
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		while(scan.hasNext()){
			double x1,y1,x2,y2,x3,y3,xp,yp;
			x1 = scan.nextDouble();
			y1 = scan.nextDouble();
			x2 = scan.nextDouble();
			y2 = scan.nextDouble();
			x3 = scan.nextDouble();
			y3 = scan.nextDouble();
			xp = scan.nextDouble();
			yp = scan.nextDouble();
			double z1=(x3 - x2)*(yp - y2) - (y3 - y2)*(xp - x2);
			double z2=(x1 - x3)*(yp - y3) - (y1 - y3)*(xp - x3);
			double z3=(x2 - x1)*(yp - y1) - (y2 - y1)*(xp - x1);
			if(z1>=0&&z2>=0&&z3>=0||z1<=0&&z2<=0&&z3<=0){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
	}

}