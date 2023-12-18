import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int x = 0;
		int y = 0;
		int z = 1;

		if(n-m>0){
			y = (n-m)*100;
		}
		double k = Math.pow(2, m);

		//int -2147483648 2147483647
		for(int i=1; i<2147483647; i++){
			x += (y + 1900*m*i)/(Math.pow(k, i));
		}
		System.out.println(x);

	}
}
