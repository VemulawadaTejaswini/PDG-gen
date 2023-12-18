import java.util.Scanner;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		int k  = sc.nextInt();
		
		int counter = 0;
		long ref = 1;
		
		while(n>=ref) {
			ref = ref*k;
			counter++;
		}

		System.out.println(counter);
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
