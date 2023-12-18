import java.util.Scanner;

public class Main {
	public static void main(String[] args){



		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int k = sc.nextInt();

		if(n<k) {
			for(int i =0;i<k;i++) {
				System.out.print(n);
			}
		}else {
			for(int i =0;i<n;i++) {
				System.out.print(k);
			}
		}
		System.out.println("");

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
