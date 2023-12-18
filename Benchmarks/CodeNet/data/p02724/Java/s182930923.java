import java.util.Scanner;

public class Main {

	static long bignum = 1000000000+7;

	public static int[] rudder = new int[200001];

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int a = x/500;
		x = x%500;
		int b = x/5;
		System.out.println(1000*a+5*b);
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
