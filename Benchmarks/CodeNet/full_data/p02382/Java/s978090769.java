import java.util.Scanner;
public class Main {
	void run(){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];
		for(int i = 0;i < n;i++)
			x[i] = s.nextInt();
		for(int i = 0;i < n;i++)
			y[i] = s.nextInt();
		double p1 = 0;
		double p2 = 0;
		double p3 = 0;
		double pInfi = 0;
		for(int i = 0;i < n;i++){
			int abs = Math.abs(x[i] - y[i]);
			p1 += abs;
			p2 += (double)(abs * abs);
			p3 += (double)(abs * abs * abs);
			if(pInfi < abs)pInfi = abs;
		}
		p2 = Math.sqrt(p2);
		p3 = Math.cbrt(p3);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(pInfi);
		
	}
	public static void main(String args[]){
		new Main().run();
	}
}