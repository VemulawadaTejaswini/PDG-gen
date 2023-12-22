import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		DecimalFormat df1 = new DecimalFormat("0.########");
		DecimalFormat df2 = new DecimalFormat("0.00000000");
		
		
		while(true){
			double n = sc.nextDouble();//人数の入力
			if(n == 0){//人数が0ならば終了する
				break;
			}
			double s[] = new double[n];
			double i, m;
			double sum = 0;
			double x = 0;
			double y = 0;
			for(i = 0; i < n; i++){
				s[i] = sc.nextInt();//点数を入力する
				sum = sum + s[i];
			}
			m = sum / n;//点数の合計と人数を割って平均点を出す
			;
			for(i = 0; i < n; i++){
				x = s[i] * s[i] - 2 * s[i] * m + m * m;
			}
			double a = Math.sqrt(x / n);
			if(a > 0){
				System.out.println(df1.format(a));
			}
			else if(a == 0){
				System.out.println(df2.format(a));
			}
		}
	}
}
