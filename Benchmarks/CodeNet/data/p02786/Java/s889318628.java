import java.util.Scanner;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		long h  = sc.nextLong();
		
		
		
		long sum =0;
		
		
		while (h>1) {
			h=h/2;
			sum++;
		}
		
		
		System.out.println((long)(Math.pow(2, sum+1)-1));
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
