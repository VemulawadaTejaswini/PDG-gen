import java.util.Scanner;

public class Main {
	public static void main(String[] args){



		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		
		int a = sc.nextInt();
		int n = h/a;
		if(n*a==h) {
			System.out.println(n);
		}else {
			System.out.println(n+1);
			
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
