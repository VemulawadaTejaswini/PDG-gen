import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args){



		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int m1 = sc.nextInt();
		int d1 = sc.nextInt();
		int m2 = sc.nextInt();
		int d2 = sc.nextInt();
		
		if(m1<m2) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
		
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
