import java.util.Scanner;
import java.lang.Math;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int a = sc.nextInt();
		int b = sc.nextInt();
		
		int ab = a + b;
		int x = n / ab;
		int mod = n % ab;

		if(a == 0){
			System.out.println("0");
		}else{
			System.out.println(a*x + Math.min(mod, a));
		}

	}

}