import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double n = sc.nextInt();
		double x = 100;
		for(int i = 0; i < n; i++){
			x = Math.ceil(x + (x * 0.05));
		}
		System.out.println((int)x * 1000);
	}
}