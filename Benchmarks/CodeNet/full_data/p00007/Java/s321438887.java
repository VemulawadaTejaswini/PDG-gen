import java.util.Scanner;
class Main{
	public static void main(String[] a){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int debt = 100000;
		for(int i = 0; i < n; i++){
			debt += debt / 20;
			debt = up(debt);
		}
		System.out.println(debt);
	}
	static int up(int money){
		money += 999;
		money -= money % 1000;
		return money;
	}
}