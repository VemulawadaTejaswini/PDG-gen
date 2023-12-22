import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		do {
			num = sc.nextInt();
		} while (num>100);
		
		double x1=0,y1=0,x2=0,y2=0,x3=0,y3=0,x4=0,y4=0;
		
		for(int i=0; i<num; i++){
			x1 = sc.nextDouble();
			y1 = sc.nextDouble();
			x2 = sc.nextDouble();
			y2 = sc.nextDouble();
			x3 = sc.nextDouble();
			y3 = sc.nextDouble();
			x4 = sc.nextDouble();
			y4 = sc.nextDouble();
			
			double slope_1 = (y2-y1)/(x2-x1);
			double slope_2 = (y4-y3)/(x4-x3);
			
			if(slope_1 == slope_2){
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}		
	}
}	