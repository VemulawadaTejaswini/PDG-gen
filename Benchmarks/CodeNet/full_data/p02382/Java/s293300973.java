import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int  num = scanner.nextInt();	//要素数
		double array_x[] = new double[num];
		double array_y[] = new double[num];
		double euc1 = 0;
		double euc1_w = 0;
		double euc2 = 0;
		double euc2_t = 0;
		double chess = 0;
		double abs;
		double sum = 0;
		double sum_min[] = new double[5];
		
		//xの要素
		for(int i = 0 ; i < num ; i ++){
			array_x[i] = scanner.nextDouble();
		}
		//yの要素
		for(int i = 0 ; i < num ; i ++){
			array_y[i] = scanner.nextDouble();
		}
		
		////距離を求める
		//３まで
		for(int i = 1; i < 4 ; i++ ){
			for( int j = 0; j < num ; j ++ ){
				abs = ( array_x[j] - array_y[j] );
				abs = Math.abs(abs);
				abs = Math.pow(abs, i);
				sum += abs;
			}
			double man = (double)i;
			sum_min[i] = Math.pow(sum, 1/man);
			sum = 0;
		}
		//４から
		double x = 10;
		for( int j = 0; j < num ; j ++ ){
			abs = ( array_x[j] - array_y[j] );
			abs = Math.abs(abs);
			abs = Math.pow(abs, x);
			sum += abs;
		}
		sum_min[4] = Math.pow(sum, 1/x);
		sum = 0;
		
		
		for(int i = 1 ; i <= 4 ; i ++){
			System.out.println(sum_min[i]);
		}
		
		scanner.close();
	}
}

