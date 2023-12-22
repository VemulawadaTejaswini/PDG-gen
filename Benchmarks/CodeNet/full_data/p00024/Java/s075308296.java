import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextDouble()){
			double x = sc.nextDouble();
			
			double v = 0;
			int t = 0;
			while(v <= x){
				v = 9.8 * t;
			t++;
			}
			double y = 4.9 * t*t;
			
			int N = 0;
			int xx = 0;
			while(xx < y){
				N++;
				xx = 5 * N -5;
			}
			System.out.println(N-9);
		}
	}
}