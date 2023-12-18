import java.util.Scanner;

public class Main {
	public static void main(String[] args){



		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		double[] x = new double[n];
		double[] y = new double[n];
		for(int i =0;i<n;i++) {
			x[i] = sc.nextDouble();
			y[i] = sc.nextDouble();
		}
		
		double sum=0;
		for(int i =0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				sum+=Math.sqrt(Math.pow(x[i]-x[j],2)+Math.pow(y[i]-y[j],2));
			}
		}
		int divide = 1;
		for(int i =1;i<n+1;i++) {
			divide = divide*i;
		}
		divide  = divide/2;
		System.out.println(sum*2/n);
	}

	

}
/*
class City{
	int order;
	int prefecture;
	int year;
	int number;
	City(int order,int prefecture, int year){
		this.order = order;
		this.prefecture = prefecture;
		this.year = year;
	}
}
*/
