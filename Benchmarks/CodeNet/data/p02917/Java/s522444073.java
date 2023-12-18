import java.util.Scanner;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();

		//int[] a = new int[n];
		int[] b = new int[n];


		for(int i =0 ; i<n-1;i++) {
			b[i] = sc.nextInt();
		}
		b[n-1]=-1;



		long sum = 0;
		for(int i =1;i<n-1;i++) {
			sum+=Math.min(b[i-1], b[i]);
		}
		sum+=b[0];
		sum+=b[n-2];



		System.out.println(sum);
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