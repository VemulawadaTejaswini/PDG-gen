import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		// 整数の入力
		int have = sc.nextInt();
		int choise = sc.nextInt();
		int[] stick = new int[have];
		for(int i=0;i<have;i++){
			stick[i] = sc.nextInt();
		}
		Arrays.sort(stick);
		for(int j = 0;j<choise;j++){
			sum += stick[have-1-j];
		}

		System.out.println(sum);
	}
}