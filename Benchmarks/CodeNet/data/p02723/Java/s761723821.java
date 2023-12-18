import java.util.Scanner;

public class Main {

	static long bignum = 1000000000+7;

	public static int[] rudder = new int[200001];

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String[] ss = s.split("");
		if(ss[2].equals(ss[3])) {
			if(ss[4].equals(ss[5])) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
			
		}else {
			System.out.println("No");
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
