import java.util.Scanner;
import java.lang.Math;
public class Main {
	public static int gcd(int a, int b){
		while(b != 0){
			int temp = b;
			b = a % b;
			a = temp;
		}

		return a;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n, x;
		n = sc.nextInt();
		x = sc.nextInt();


		int[] cities = new int[n];
		int res = -1;

		cities[0] = sc.nextInt();
		for(int i = 0; i < n - 1; i++){
			cities[i + 1] = sc.nextInt();
			if(x < cities[i] || cities[i + 1] < x){
				if(res == -1){
					res = cities[i + 1] - cities[i];
				} else {
					res = gcd(res, cities[i + 1] - cities[i]);
				}
			} else {
				if(res == -1){
					res = x - cities[i];
				} else {
					res = gcd(res, x - cities[i]);
				}
				res = gcd(res, cities[i + 1] - x);
			}
		}
		if(n == 1){
			res = Math.abs(cities[0] - x);
		}
		System.out.println(res);
	}
}