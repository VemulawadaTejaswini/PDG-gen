import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int x = sc.nextInt();
		int count = 0;
		for(int i =0; i <= a; i++){
			int money = i * 500;
			if(money > x) break;
			for(int j = 0; j <= b; j++){
				if(money + j * 100 > x) break;
				for(int k = 0; k <= c; k++){
					if(money + j * 100 + k * 50 > x	)break;
					if(x == i * 500 + j * 100 + k * 50) count++;
				}
			}
		}
		System.out.println(count);
	}
}