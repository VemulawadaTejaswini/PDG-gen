import java.util.Scanner;

public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		doIt();
	}
	public static void doIt(){
		Scanner sc = new Scanner(System.in);
		//a0 1b 2c 3d 4e 5f
		double[] v = new double[6];
		double x = 0;
		double y = 0;
		while(sc.hasNext()){
			//System.out.println("ts");
			//Math.round
			for(int i = 0; i < 6; i++){
				v[i] = sc.nextDouble();
				//System.out.println(i + " " + v[i]);
			}
			//sc.nextInt();
//			if(v[0] == 0){
//				y = v[2] / v[1];
//				x = 
//			}
			double tmp1 = v[1] * v[3] - v[0] * v[4];
			double tmp2 = v[3] * v[2] - v[0] * v[5];
			y = tmp2 / tmp1;
			//小数点代4位を四捨五入
			y *= 1000;
			y = Math.round(y) / 1000;
			x = v[2] - v[1]*y;
			x /= v[0];
			x *= 1000;
			x = Math.round(x) / 1000;
			x += 0.000;
			//System.out.println(x + " " + y);
			System.out.printf("%.3f %.3f\n", x,y);
		}
	}

}