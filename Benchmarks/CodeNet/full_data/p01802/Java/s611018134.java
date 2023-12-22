import java.util.Scanner;

public class ACM2 {
	
	public static double distance(double d,double plan) {
		
		double y,min=101.0,tmp=0.0;
		int i;
		for(i=0;i<(int)d;i++) {
			
			y = d-i;
			tmp = Math.sqrt(Math.pow(y, 2.0)+Math.pow(i, 2.0));
			tmp -= plan;
			tmp = Math.abs(tmp);
			
			if(tmp<min) {
				min = tmp;
			}
			
		}
		
		return tmp;
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int i;
		double d,p;
		
		while(true) {
			d = sc.nextDouble();
			p = sc.nextDouble();
			
			if(p == 0.0 && d == 0.0) break;
			
			System.out.println(distance(d,p));
		}

	}

}
