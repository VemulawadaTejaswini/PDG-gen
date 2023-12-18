import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int N = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int min = 0;

		if((b - a) > (c - b)){
			min = (c - b) + (K - c);
		}else if((c - b) > (K - c + a)){
			min = (K - c) + (b - a);
		}else if((K - c + a) > (b - a)){
			min = (b - a) + (c - b);
		}

		System.out.println(min);
		sc.close();
	}
}