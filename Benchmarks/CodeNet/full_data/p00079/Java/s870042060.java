import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double[][] p = new double[20][2];
		int n = 0;
		
		while(scan.hasNext()){
			String s[] = scan.next().split(",");
			p[n][0]=Double.parseDouble(s[0]);
			p[n][1]=Double.parseDouble(s[1]);
			n++;
		}
		
		double a = 0;
		
		for(int i = 0; i < n; i++){
			double x1 = p[i][0];
			double y1 = p[i][1];
			double x2 = p[(i + 1) % n][0];
			double y2 = p[(i + 1) % n][1];
			a += x1 * y2 - x2 * y1;
		}
		System.out.println(Math.abs(a / 2));
	}
}